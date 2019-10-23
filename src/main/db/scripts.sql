
-- USER_TABLE

DROP TABLE public.demo_user;

CREATE TABLE public.demo_user
(
    id serial PRIMARY KEY NOT NULL,
    active boolean NOT NULL,
    created_by bigint NOT NULL,
    created_date timestamp NOT NULL,
    updated_by bigint,
    updated_date timestamp,
    email character varying(255) UNIQUE NOT NULL,
    password character varying(255) NOT NULL,
    token character varying(255) NOT NULL,
    user_role integer NOT NULL,
    username character varying(255) UNIQUE NOT NULL
)
WITH (
    OIDS = FALSE
)