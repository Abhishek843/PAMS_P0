USE PAMS_PROJECT;

/*INSERT QUERIES*/
INSERT INTO DOCTOR 
(DOCTOR_ID, DOCTOR_NAME, DOCTOR_EXPERIENCE, DOCTOR_SLOTS, DOCTOR_EDUCATION,  DOCTOR_CHARGES,TYPE_OF_DOCTOR)

VALUES
(101, "Ape", 2, 5, 'MBBS', 150,"eye specialist"),
(102, "rge", 8, 6, 'MBBBS', 50,"child specialist"),
(103, "ngo", 4, 8, 'MBBBS', 250,"cancer specialist"),
(104, "Gpes", 5, 3, 'MBBBS', 150,"lever specialist"),
(105, "ato", 2, 5, 'MBBBS', 150,"eye specialist"),
(106, "Cot", 8, 6, 'MBBBS', 50,"skin specialist"),
(107, "ady ", 4, 8, 'MBBBS', 250,"skin specialist"),
(108, "nio", 5, 3, 'MBBBS', 150,"eye specialist"),
(109, "meg", 2, 5, 'MBBBS', 150,"child specialist"),
(110, "Pepper", 8, 6, 'MBBBS', 50,"cancerspecialist"),
(111, "amom", 4, 8, 'MBBBS', 250,"child specialist"),
(112, "affron", 5, 3, 'MBBBS', 150,"lever specialist");

INSERT INTO PATIENT
(
`Customer_name`, 
`email` , 
`phone` ,
`address` , 
`date_of_birth`, 
`age` ,
`password`,
`identity_proof`,
`preferred_login_id`)
VALUES
("Alexa","al9090@hmail.com", 9090787856, "Street 12, green tower, Jordan", 
    "1989-10-10", 32, "xxxxxxx", "visa card", "al9090@hmail.com"),
    
    ("Alexander","polo90@hmail.com", 9898990908, "Street 3, twin tower, tordan", 
    "1978-02-19", 43, "xxxxxxx", "visa card", "polo90@hmail.com"),
    
    ("Marie","al9090@hmail.com", 9898989907, "Street 3, twin tower, Jordan", 
    "2001-10-28", 21, "xxxxxxx", "visa card", "al9090@hlmail.com"),
    
    ("Jacky","loki0@hmail.com", 9897856489, "Street 2,quad tower, london", 
    "1978-09-23", 44, "xxxxxxx", "visa card", "loki@hmail.com"),
    
    ("Bob","bob@hmail.com", 9898907869, "Street 3, twin tower, Jordan", 
    "2002-09-11",20, "xxxxxxx", "visa card", "bob@hmail.com"),
    
    ("Alexa","al9090@hmail.com", 9894523889, "Street 3, twin tower, Jordan", 
    "1999-11-10", 23, "xxxxxxx", "visa card", "alexa_9090"),
    
    ("Sonail","sonail@hmail.com", 9897890589, "Street 3, twin tower, Jordan", 
    "1993-12-12", 29, "xxxxxxx", "visa card", "sonail_675");

INSERT INTO APPOINTMENT_DETAILS
(APPOINTMENT_ID, preferred_login_id, DOCTOR_ID, PATIENT_AGE, TOTAL_FEE, APPOINTMENT_DATE, STATUS , CANCELLATION_DATE, CANCELLATION_REASON)

VALUES 
(10001,"sonail_675", 101 , 3, 100.00,'2022-10-23',"Confirmed", null, null),
(10002,"alexa_9090",106 , 2, 200.00 , '2022-10-20',"Confirmed",null,null),
(10003,"bob@hmail.com",108,1,300.00, '2022-11-23',"Confirmed", null,null),
(10004,"loki@hmail.com", 104 , 5, 100.00,'2022-10-23',"Confirmed", null, null),
(10005,"sonail_675", 103 , 3, 100.00,'2022-10-23',"Confirmed", null, null),
(10006,"bob@hmail.com", 111 , 4, 500.00,'2022-10-23',"Confirmed", null, null),
(10007,"polo90@hmail.com", 112 , 3, 600.00,'2022-10-23',"Confirmed", null, null),
(10008,"sonail_675", 103 , 1, 200.00,'2022-10-23',"Confirmed", null, null),
(10009,"alexa_9090", 102 , 3, 150.00,'2022-10-23',"Confirmed", null, null);


UPDATE appointment_details SET STATUS ="Cancelled",
CANCELLATION_ID =102544, 
CANCELLATION_DATE ='2022-10-04',
 CANCELLATION_REASON = "HRUGU" 
WHERE appointment_ID= 10001;

UPDATE DOCTOR p join Appointment_details o on p.DOCTOR_ID=o.DOCTOR_ID set DOCTOR_EXPERIENCE=(p.DOCTOR_EXPERIENCE+o.PATIENT_AGE) where p.DOCTOR_ID=101;

DELETE FROM APPOINTMENT_DETAILS;
DELETE FROM  DOCTOR;