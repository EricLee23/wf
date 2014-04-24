/*==============================================================*/
/* Table: T_USER                                                */
/*==============================================================*/
create table T_USER  (
   ID                   VARCHAR2(32)                    not null,
   NAME                 VARCHAR2(32)                    not null,
   EMAIL                VARCHAR2(64)                    not null,
   PWD                  VARCHAR2(64)                    not null,
   constraint PK_T_USER primary key (ID)
);

comment on table T_USER is
'用户基本信息表';

/*==============================================================*/
/* Index: T_USER_NAME_INDEX                                     */
/*==============================================================*/
create unique index T_USER_NAME_INDEX on T_USER (
   NAME ASC
);