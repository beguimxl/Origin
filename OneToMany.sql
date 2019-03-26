SELECT logins.email, logins.password, students.name, students.phone, majors.name, majors.credits, teachers.name, teachers.phone
FROM logins
JOIN students
ON students.student_id = logins.login_id
JOIN majors
ON students.major_id = majors.major_id
JOIN teachers
ON teachers.major_id = majors.major_id
