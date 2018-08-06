# Complaint-Box

Complaint box made using java swings and oracle database.
Consists of two portals:

1) Student Portal-Student can log in with enrollment number and  password. 
After login student can create complaint to various college department ex: library,mess academics etc.
Another options are view complaint and cancel complaint in which student can view there complaints and cancel their pending complaint.

2)Admin Portal-There are various department such as library,mess,etc. 
Head of these department log in to admin portal with department name and password.
After login admin can see the complaints filed against that particular department by the students.
If complaint is processed then admin can mark that particular complaint solved which is also displayed
in the view complaint section of student account.complaint is tracked by complaint no which is unique for every complaint.

Every complaint is tracked by a complaint number which is unique for every complaint.

complaint text is stored in text file using file handling.

Oracle database is used to store student data admin data and complaint data.

Three tables are used in oracle sql.

1)Accounts table: Consists of student data.
       structure: 
                   ID                VARCHAR2(20);
                   PASSWORD          VARCHAR2(50);
                   NAME              VARCHAR2(30);
                   SEMESTER          NUMBER(2);
                   DEPARTMENT        VARCHAR2(20).

2)Admin table: Consists of admin data.
    structure: 
                 DEPID                VARCHAR2(30);
                 DEPPASSWORD          VARCHAR2(20);
                 DEPNAME              VARCHAR2(50);
 
 3) Complaint: consist of complaint data.
    structure: 
               COMPLAINTNO                NOT NULL NUMBER(10);
               COMPLAINTDATE                   DATE;
                   ID                     VARCHAR2(20);
                DEPARTMENT                VARCHAR2(80);
                 SUBJECT                  VARCHAR2(200);
                 STATUS                   VARCHAR2(20).
  complaint text is stored in file.
