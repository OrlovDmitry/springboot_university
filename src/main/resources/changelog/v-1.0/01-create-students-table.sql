create table students (
                          id integer not null auto_increment,
                          date_of_enrollment varchar(15),
                          name varchar(15) not null,
                          group_id integer,
                          primary key(id)
) engine=InnoDB;


alter table students
    add constraint FK_group_id
        foreign key (group_id)
            references university_groups(id)