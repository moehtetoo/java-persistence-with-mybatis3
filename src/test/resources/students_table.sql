-- Table: public.students

-- DROP TABLE public.students;

CREATE TABLE public.students
(
  stud_id integer NOT NULL,
  name text,
  address text
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.students
  OWNER TO postgres;
