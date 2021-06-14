-- we don't know how to generate root <with-no-name> (class Root) :(
create table airport
(
	airport_code varchar(3) not null
		constraint airport_pkey
			primary key,
	name varchar(50) not null,
	city varchar(30) not null,
	state varchar(30)
);

alter table airport owner to postgres;

create table customer
(
	customer_name varchar(50) not null,
	customer_phone varchar(14) not null,
	address text not null,
	country varchar(30) not null,
	e_mail varchar(30) not null,
	passport_number varchar(12) not null
		constraint customer_pkey
			primary key
);

alter table customer owner to postgres;

create table ffc
(
	passport_number varchar(12) not null
		constraint ffc_passport_number_fkey
			references customer,
	ffc_id varchar(10) not null
		constraint ffc_pkey
			primary key,
	total_miles integer not null,
	mile_points integer
		constraint mile_points_check
			check (mile_points >= 0),
	category varchar(10)
);

alter table ffc owner to postgres;

create table company
(
	company_id varchar(6) not null
		constraint company_pkey
			primary key,
	company_name varchar(50) not null
);

alter table company owner to postgres;

create table airline
(
	company_id varchar(6) not null
		constraint airline_company_id_fkey
			references company,
	airline_name varchar(50) not null,
	airline_id varchar(2) not null
		constraint airline_pkey
			primary key
		constraint airline_code_check
			check (length((airline_id)::text) = 2)
);

alter table airline owner to postgres;

create table airplane_type
(
	airplane_type_name varchar(20) not null
		constraint airplane_type_pkey
			primary key,
	max_seats integer not null,
	company varchar(6) not null
		constraint airplane_type_company_fkey
			references company
);

alter table airplane_type owner to postgres;

create table airplane
(
	airplane_id varchar(4) not null
		constraint airplane_pkey
			primary key,
	total_number_of_seats integer not null,
	airplane_type varchar(20) not null
		constraint airplane_type_fkey
			references airplane_type,
	company_id varchar(6) not null
		constraint airplane_company_id_fkey
			references company
);

alter table airplane owner to postgres;

create table can_land
(
	airplane_type_name varchar(20) not null
		constraint can_land_airplane_type_name_fkey
			references airplane_type,
	airport_code varchar(3) not null
		constraint can_land_airport_code_fkey
			references airport,
	constraint can_land_pkey
		primary key (airplane_type_name, airport_code)
);

alter table can_land owner to postgres;

create table flight
(
	flight_number varchar(6) not null
		constraint flight_pkey
			primary key,
	airline varchar(2) not null
		constraint flight_airline_fkey
			references airline,
	weekdays varchar(15) not null
		constraint weekday_check
			check (((weekdays)::text = 'Monday'::text) OR ((weekdays)::text = 'Tuesday'::text) OR ((weekdays)::text = 'Wednesday'::text) OR ((weekdays)::text = 'Thursday'::text) OR ((weekdays)::text = 'Friday'::text) OR ((weekdays)::text = 'Saturday'::text) OR ((weekdays)::text = 'Sunday'::text)),
	constraint airline_check
		check ("substring"((flight_number)::text, 1, 2) = (airline)::text)
);

alter table flight owner to postgres;

create table flight_leg
(
	flight_number varchar(6) not null
		constraint flight_leg_flight_number_fkey
			references flight,
	leg_number varchar(8) not null,
	departure_airport_code varchar(3) not null
		constraint flight_leg_dep_airport_code_fkey
			references airport,
	arrival_airport_code varchar(3) not null
		constraint flight_leg_arr_airport_code_fkey
			references airport,
	scheduled_departure_time time not null,
	scheduled_arrival_time time not null,
	miles integer not null,
	flight_flight_number varchar(255),
	constraint flight_leg_pkey
		primary key (leg_number, flight_number),
	constraint code_check
		check ("substring"((leg_number)::text, 1, length((flight_number)::text)) = (flight_number)::text),
	constraint diff_airport_check
		check ((departure_airport_code)::text <> (arrival_airport_code)::text)
);

alter table flight_leg owner to postgres;

create table leg_instance
(
	flight_number varchar(6) not null,
	leg_number varchar(8) not null,
	date date not null,
	number_of_available_seats integer,
	airplane_id varchar(4) not null
		constraint leg_instance_airplane_id_fkey
			references airplane,
	departure_airport_code varchar(3) not null
		constraint leg_instance_dep_airport_code_fkey
			references airport,
	arrival_airport_code varchar(3) not null
		constraint leg_instance_arr_airport_code_fkey
			references airport,
	departure_time time not null,
	arrival_time time not null,
	airplane_airplane_id varchar(255),
	constraint leg_instance_pkey
		primary key (leg_number, flight_number, date),
	constraint leg_instance_flight_number_leg_number_fkey
		foreign key (flight_number, leg_number) references flight_leg (flight_number, leg_number)
);

alter table leg_instance owner to postgres;

create table seat_reservation
(
	flight_number varchar(6) not null,
	leg_number varchar(8) not null,
	date date not null,
	seat_number integer not null,
	passport_number varchar(12) not null
		constraint seat_reservation_passport_number_fkey
			references customer,
	customer_passport_number varchar(255),
	constraint seat_reservation_pkey
		primary key (leg_number, flight_number, date, seat_number),
	constraint sr_fn_ln_date_fkey
		foreign key (flight_number, leg_number, date) references leg_instance (flight_number, leg_number, date)
);

alter table seat_reservation owner to postgres;

create table fare
(
	flight_number varchar(6) not null
		constraint fare_flight_number_fkey
			references flight,
	fare_code varchar(8) not null,
	amount integer not null,
	restrictions varchar(15) not null,
	constraint fare_pkey
		primary key (fare_code, flight_number)
);

alter table fare owner to postgres;

create table check_in
(
	passport_number varchar(12) not null
		constraint check_in_passport_number_fkey
			references customer,
	flight_number varchar(6) not null,
	leg_number varchar(8) not null,
	miles integer,
	date date not null,
	constraint check_in_pkey
		primary key (passport_number, flight_number, leg_number, date),
	constraint check_in_leg_number_flight_number_date_fkey
		foreign key (flight_number, leg_number, date) references leg_instance (flight_number, leg_number, date)
);

alter table check_in owner to postgres;

create table ticket
(
	passport_number varchar(12) not null
		constraint ticket_passport_number_fkey
			references customer,
	flight_number varchar(6) not null,
	fare_code varchar(8) not null,
	used_mile_points integer,
	ticket_price integer,
	date date not null,
	constraint ticket_pkey
		primary key (passport_number, flight_number, fare_code, date),
	constraint ticket_flight_number_fare_code_fkey
		foreign key (flight_number, fare_code) references fare (flight_number, fare_code)
);

alter table ticket owner to postgres;

create view ucus_bilgileri(customer_name, passport_number, seat_number, leg_number, date) as
	SELECT customer.customer_name,
       customer.passport_number,
       seat_reservation.seat_number,
       seat_reservation.leg_number,
       seat_reservation.date
FROM customer,
     seat_reservation,
     flight
WHERE customer.passport_number::text = seat_reservation.passport_number::text
  AND seat_reservation.flight_number::text = flight.flight_number::text;

alter table ucus_bilgileri owner to postgres;

create view "non ffc customer"(customer_name, customer_phone, adress, country, e_mail, passport_number) as
	SELECT customer.customer_name,
       customer.customer_phone,
       customer.address,
       customer.country,
       customer.e_mail,
       customer.passport_number
FROM customer
WHERE NOT (EXISTS(SELECT ffc.passport_number,
                         ffc.ffc_id,
                         ffc.total_miles
                  FROM ffc
                  WHERE ffc.passport_number::text = customer.passport_number::text));

alter table "non ffc customer" owner to postgres;

create view "company ve flight bilgileri"(flight_number, airline_name, company_name) as
	SELECT flight.flight_number,
       airline.airline_name,
       company.company_name
FROM flight,
     airline,
     company
WHERE flight.airline::text = airline.airline_id::text
  AND company.company_id::text = airline.company_id::text;

alter table "company ve flight bilgileri" owner to postgres;

create view ucak_guzergah(airplane_id, airplane_type, leg_number, departure_airport, arrival_airport) as
	SELECT airplane.airplane_id,
       airplane.airplane_type,
       leg_instance.leg_number,
       dep.name AS departure_airport,
       arr.name AS arrival_airport
FROM airplane,
     leg_instance,
     airport dep,
     airport arr
WHERE airplane.airplane_id::text = leg_instance.airplane_id::text
  AND leg_instance.departure_airport_code::text = dep.airport_code::text
  AND leg_instance.arrival_airport_code::text = arr.airport_code::text;

alter table ucak_guzergah owner to postgres;

create view "uçuşlar ve fare bilgileri"(flight_number, airline_name, weekdays, fare_code, amount, restrictions) as
	SELECT flight.flight_number,
       airline.airline_name,
       flight.weekdays,
       fare.fare_code,
       fare.amount,
       fare.restrictions
FROM flight
         FULL JOIN fare ON flight.flight_number::text = fare.flight_number::text,
     airline
WHERE airline.airline_id::text = flight.airline::text;

alter table "uçuşlar ve fare bilgileri" owner to postgres;

create function milesadd() returns trigger
	language plpgsql
as $$
declare milInfo flight_leg.miles%type;
begin
	select miles 
	into milInfo 
	from flight_leg
	where flight_leg.leg_number = new.leg_number;
		
	new.miles = milInfo;
	
	return new;
end;
$$;

alter function milesadd() owner to postgres;

create trigger mil_update
	before insert or update
	on check_in
	for each row
	execute procedure milesadd();

create function customerdelete() returns trigger
	language plpgsql
as $$
BEGIN
   RAISE EXCEPTION  'cannot delete customer';
   
   return new;
  
END;
$$;

alter function customerdelete() owner to postgres;

create trigger customer_cannot_delete
	after delete
	on customer
	execute procedure customerdelete();

create function seatarrange() returns trigger
	language plpgsql
as $$
declare seatInfo airplane.total_number_of_seats%type;
begin
	select total_number_of_seats 
	into seatInfo 
	from airplane
	where airplane.airplane_id = new.airplane_id;
		
	new.number_of_available_seats = seatInfo*0.7;
	
	return new;
end;
$$;

alter function seatarrange() owner to postgres;

create trigger availableseats
	before insert
	on leg_instance
	for each row
	execute procedure seatarrange();

create function updateavailableseat() returns trigger
	language plpgsql
as $$
begin
	update leg_instance set number_of_available_seats = number_of_available_seats-1
    where leg_instance.flight_number = new.flight_number and
	leg_instance.leg_number = new.leg_number and
	leg_instance.date = new.date;
    return new;
end;
$$;

alter function updateavailableseat() owner to postgres;

create trigger setavailableseats
	after insert
	on seat_reservation
	for each row
	execute procedure updateavailableseat();

create function updatetotalmiles() returns trigger
	language plpgsql
as $$
declare check_in_miles check_in.miles%type;
begin
	select new.miles into check_in_miles
	from check_in
	where exists(select passport_number from ffc where ffc.passport_number = new.passport_number);

	update ffc set total_miles = total_miles+check_in_miles
    	where ffc.passport_number = new.passport_number
		and substring(ffc.ffc_id  from 1 for 2)=substring(new.flight_number from 1 for 2);
	update ffc set mile_points = mile_points+check_in_miles*0.1
		where ffc.passport_number = new.passport_number
		and substring(ffc.ffc_id  from 1 for 2)=substring(new.flight_number from 1 for 2);
   	 return new;
end;
$$;

alter function updatetotalmiles() owner to postgres;

create trigger total_miles_update
	after insert
	on check_in
	for each row
	execute procedure updatetotalmiles();

create function updatecategory() returns trigger
	language plpgsql
as $$
BEGIN
	if(new.total_miles>1000) then
	new.category='GOLD';
	elsif(new.total_miles>=600) then
	new.category='SILVER';
	else
	new.category = 'BRONZE';
	end if;
   return new;
END;
$$;

alter function updatecategory() owner to postgres;

create trigger setcategory
	before insert or update
	on ffc
	for each row
	execute procedure updatecategory();

create function setprice() returns trigger
	language plpgsql
as $$
declare
	amount_of fare.amount%type;
	category_of_ffc ffc.category%type;
	temp_price fare.amount%type;
	used_points ffc.mile_points%type;
BEGIN
	select fare.amount
	into amount_of
	from fare
	where new.fare_code = fare.fare_code
	and new.flight_number = fare.flight_number;
	if exists(select * from ffc where ffc.passport_number = new.passport_number) then
		--ffcdeki mile_points update kısmı
		used_points = new.used_mile_points;
		update ffc set mile_points=(mile_points-used_points) where ffc.passport_number = new.passport_number
		and substring(ffc.ffc_id from 1 for 2) = substring(new.fare_code from 1 for 2);
		
		--ticketdaki price kısmı
		new.ticket_price = (amount_of-new.used_mile_points*0.1);
		temp_price = new.ticket_price;
		select ffc.category into category_of_ffc from ffc where ffc.passport_number = new.passport_number
		and substring(ffc.ffc_id from 1 for 2) = substring(new.fare_code from 1 for 2);
		if(category_of_ffc = 'GOLD') then
			new.ticket_price = temp_price*0.85;
		elsif (category_of_ffc = 'SILVER') then
			new.ticket_price = temp_price*0.90;
		end if;
	else
		new.ticket_price = amount_of;
	end if;
	
   return new;
  
END;
$$;

alter function setprice() owner to postgres;

create trigger setprice
	before insert or update
	on ticket
	for each row
	execute procedure setprice();

