INSERT INTO township  (`name`) VALUES ('Yangon');
INSERT INTO township  (`name`) VALUES ('Maubin');
INSERT INTO township  (`name`) VALUES ('Pathein');

INSERT INTO availabilitytype  (`description`) VALUES ('immediately');
INSERT INTO availabilitytype  (`description`) VALUES ('1 week');
INSERT INTO availabilitytype  (`description`) VALUES ('2 week');
INSERT INTO availabilitytype  (`description`) VALUES ('1 or 2 month');

INSERT INTO candidatejoborderstatus  (`id`,`short_description`) VALUES ('100', 'Added');
INSERT INTO candidatejoborderstatus  (`id`,`short_description`) VALUES ('200', 'Contacted');
INSERT INTO candidatejoborderstatus  (`id`,`short_description`) VALUES ('300', 'Qualifying');
INSERT INTO candidatejoborderstatus  (`id`,`short_description`) VALUES ('400', 'Submitted');
INSERT INTO candidatejoborderstatus  (`id`,`short_description`) VALUES ('500', 'First Interview');
INSERT INTO candidatejoborderstatus  (`id`,`short_description`) VALUES ('600', 'Offered');
INSERT INTO candidatejoborderstatus  (`id`,`short_description`) VALUES ('700', 'Client Declined');
INSERT INTO candidatejoborderstatus  (`id`,`short_description`) VALUES ('800', 'Placed');
INSERT INTO candidatejoborderstatus  (`id`,`short_description`) VALUES ('900', 'Second Interview');
INSERT INTO candidatejoborderstatus  (`id`,`short_description`) VALUES ('1000', 'Third Interview');



INSERT INTO recruiter (`email`, `name`, `password`, `phone`) VALUES ('eht@gmail.com', 'eht', '082179@eht', '4545454545');
INSERT INTO recruiter (`email`, `name`, `password`, `phone`) VALUES ('eaint@gmail.com', 'eaint', '082179', '635454555');

INSERT INTO company (`address`, `email`, `entry_date`, `ishot`, `name`, `ownerName`, `phone1`, `phone2`, `remark`, `website`, `entryBy`, `township_id`) VALUES ('3626  Villa Drive', 'test@gmail.com', '2020-11-23', 'yes', 'TEST', 'Kaung', '567564545', '5446687', 'Hey', 'test@gmail.com', '1', '1');
INSERT INTO company (`address`, `email`, `entry_date`, `ishot`, `name`, `ownerName`, `phone1`, `phone2`, `remark`, `website`, `entryBy`, `township_id`) VALUES ('Villa Drive', 'abc@gmail.com', '2020-11-24', 'yes', 'ABC', 'Thant', '567564545', '5446687', 'Hey', 'abc@gmail.com', '1', '2');

INSERT INTO candidate (`email`, `entry_date`, `expectedSalary`, `is_active`, `key_skills`, `name`, `phone`, `availiability_id`, `entryBy`, `township_id`,`cv_form`) VALUES ('kk@gmail.com', '2020-11-24', '500000', 'yes', 'JAVA, PHP', 'Kaung Kaung', '6545646548', '4', '1', '2','JSF2-Ajax.pdf');
INSERT INTO candidate (`email`, `entry_date`, `expectedSalary`, `is_active`, `key_skills`,  `name`, `phone`, `availiability_id`, `entryBy`, `township_id`,`cv_form`) VALUES ('mmo@gmail.com', '2020-11-24', '800000', 'yes', 'Tik Tok', 'Mg Mg', '786768768', '2', '1', '1','how to use tik tok professionally.pdf');
INSERT INTO candidate (`email`, `entry_date`, `expectedSalary`, `is_active`, `key_skills`, `name`, `phone`, `availiability_id`, `entryBy`, `township_id`,`cv_form`) VALUES ('hilary@gmail.com', '2020-11-24', '800000', 'yes', 'PHP', 'Hilary', '769576878687', '3', '1', '3','PHP.pdf');

INSERT INTO joborder (`basic_salary`, `entry_date`, `is_active`, `job_description`, `job_position`, `total_employee`, `company`, `entryBy`, `job_location`) VALUES ('800000', '2020-11-23', 'yes', 'Description', 'Frontend Developer', '2', '1', '1', '1');
INSERT INTO joborder (`basic_salary`, `entry_date`, `is_active`, `job_description`, `job_position`, `total_employee`, `company`, `entryBy`, `job_location`) VALUES ('500000', '2020-11-24', 'yes', 'Description Of Senior Web Developer', 'Senior Web Developer', '2', '2', '1', '2');
INSERT INTO joborder (`basic_salary`, `entry_date`, `is_active`, `job_description`, `job_position`, `total_employee`, `company`, `entryBy`, `job_location`) VALUES ('800000', '2020-11-23', 'yes', 'At TikTok, we are grateful and inspired by the service and sacrifice of our men and women in uniform. We see it as vital to honor veterans not just within our own community at TikTok, but around the world. In observing.', 'Tik Tok Professional', '3', '1', '1', '1');



INSERT INTO candidate_job_order (`entry_date`, `candidate_id`, `candidatejoborderstatus_id`, `entryBy`, `joborder_id`) VALUES ('2020-11-24', '1', '100', '1', '1');

INSERT INTO candidate_job_order (`entry_date`, `candidate_id`, `candidatejoborderstatus_id`, `entryBy`, `joborder_id`) VALUES ('2020-11-24', '2', '100', '2', '1');
INSERT INTO candidate_job_order (`entry_date`, `candidate_id`, `candidatejoborderstatus_id`, `entryBy`, `joborder_id`) VALUES ('2020-11-25', '2', '100', '1', '3');
INSERT INTO candidate_job_order (`entry_date`, `candidate_id`, `candidatejoborderstatus_id`, `entryBy`, `joborder_id`) VALUES ('2020-11-24', '1', '100', '2', '2');
INSERT INTO candidate_job_order (`entry_date`, `candidate_id`, `candidatejoborderstatus_id`, `entryBy`, `joborder_id`) VALUES ('2020-11-26', '3', '100', '1', '1');