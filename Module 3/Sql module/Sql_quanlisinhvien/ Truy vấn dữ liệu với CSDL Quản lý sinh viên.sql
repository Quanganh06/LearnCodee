SELECT * FROM sinhvien.student;
select*from student
where studentName like'h%';
SELECT *
FROM class
WHERE startDate BETWEEN '2023-12-01' AND '2023-12-31';
SELECT *
FROM subject
WHERE credit BETWEEN 3 AND 5;
UPDATE student
SET classId = 2
WHERE studentName = 'Hung';
SELECT studentName, subName, mark
FROM student
JOIN enrollment ON student.StudentID = enrollment.StudentID
JOIN subject ON enrollment.SubID = subject.SubID
ORDER BY Mark DESC, StudentName ASC;


