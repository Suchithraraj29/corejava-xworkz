
//*CREATE DATABASE database_name;*/

CREATE DATABASE food_names;
use food_names;
CREATE TABLE food_info (north_indian_food varchar (20),south_indian_food varchar(20),
sushi_japan varchar(10),ramen_japan varchar(10),kebab_turker varchar(10),
pad_thai_thailand varchar(20),kimchi_korea varchar(10),
fried_chicken varchar(25),dosa varchar(12),pizza varchar(10));

desc food_info;
select *from food_info;
/*ADD*/

ALTER TABLE food_info ADD COLUMN food_price bigint(10);
ALTER TABLE food_info ADD COLUMN food_online_zamato_delivery varchar(10);
ALTER TABLE food_info ADD COLUMN food_online_swiggy_delivery varchar(20);
ALTER TABLE food_info ADD COLUMN food_self_service varchar(15);
ALTER TABLE food_info ADD COLUMN food_quantity varchar(12);
/*DROPING
ALTER TABLE table_name DROP COLUMN column_name;*/
ALTER TABLE food_info DROP COLUMN food_self_service;
ALTER TABLE food_info DROP COLUMN food_quantity;

/*Rename */
ALTER TABLE food_info RENAME  COLUMN food_online_swiggy_delivery to food_special_service ;
ALTER TABLE food_info RENAME   COLUMN food_online_zamato_delivery to food_quality ;
ALTER TABLE food_info RENAME   COLUMN food_price to non_veg_food ;


/*modifier*/
ALTER TABLE food_info MODIFY COLUMN food_price int;
ALTER TABLE food_info MODIFY COLUMN food_online_zamato_delivery int;
ALTER TABLE food_info MODIFY COLUMN food_online_swiggy_delivery int1;








//*CREATE DATABASE database_name;*/

CREATE DATABASE hotels;
use hotels;
CREATE TABLE hotel_info ( hotel_names varchar (20), hotel_floors bigint,
food_menus varchar(10),hotel_price bigint, hotel_services varchar(10),
standing_hotel varchar(20),local_hotel varchar(10),
standard_hotel varchar(25), old_hotel varchar(12),new_hotel varchar(10));
desc hotel_info;
select *from hotel_info;
/*ADD*/

ALTER TABLE hotel_info ADD COLUMN hotel_review bigint;
ALTER TABLE hotel_info ADD COLUMN hotel_dishes varchar(10);

/*ALTER TABLE table_name DROP COLUMN column_name;*/

ALTER TABLE hotel_info DROP COLUMN local_hotel;
ALTER TABLE hotel_info DROP COLUMN standard_hotel;

/*Rename */
ALTER TABLE hotel_info RENAME COLUMN hotel_price to hotel_amount ;
ALTER TABLE hotel_info RENAME COLUMN hotel_services to hotel_city;

ALTER TABLE hotel_info MODIFY COLUMN hotel_names int2;
ALTER TABLE hotel_info MODIFY COLUMN standing_hotel int4;



CREATE DATABASE banglore_places;
use banglore_places;
CREATE TABLE banglore_places_info( tippu_sultans_place varchar (20), urban_banglore bigint,
rural_bangaluru varchar(10), xwokz varchar(2), nandi_hills varchar(10),
church varchar(20),  cubbon_park varchar(10),
iskcon varchar(25), bannerghatta varchar(12),church_strret varchar(10));
desc banglore_places _info;
select *from banglore_places_info;
/*ADD*/

ALTER TABLE banglore_places_info ADD COLUMN govt_museum varchar(20)  ;
ALTER TABLE banglore_places_info ADD COLUMN ulsoor_lake varchar(10);

/*ALTER TABLE table_name DROP COLUMN column_name;*/

ALTER TABLE banglore_places_info DROP COLUMN nandi_hills;
ALTER TABLE banglore_places_info DROP COLUMN bannerghatta;

/*Rename */
ALTER TABLE banglore_places_info RENAME COLUMN tippu_sultans_place to bengaluru_places ;
ALTER TABLE banglore_places_info RENAME COLUMN cubbon_park to jawaharlal_nehru;

ALTER TABLE banglore_places_info MODIFY COLUMN church_strret int2;
ALTER TABLE banglore_places_info MODIFY COLUMN iskcon int4;



CREATE DATABASE books;
use books;
CREATE TABLE books_info( motivated_book varchar (20), biography bigint,
 story_book varchar(10), picture_book varchar(2), biology_book varchar(10),
novel varchar(20),  horror_book varchar(10),
magazines varchar(25), reference_book varchar(12),crime_book varchar(10));
desc books_info;
select *from books_info;
/*ADD*/

ALTER TABLE books_info ADD COLUMN bcom_book varchar(12)  ;
ALTER TABLE books_info ADD COLUMN myster_book varchar(10);

/*ALTER TABLE table_name DROP COLUMN column_name;*/

ALTER TABLE books_info DROP COLUMN reference_book;
ALTER TABLE books_info DROP COLUMN crime_book;

/*Rename */
ALTER TABLE books_info RENAME COLUMN magazines to chemistry_book ;
ALTER TABLE books_info RENAME COLUMN biology_book to fun_book;

ALTER TABLE books_info MODIFY COLUMN picture_book boolean;






