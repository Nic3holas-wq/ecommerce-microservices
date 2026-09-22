-- Safe to re-run against an existing development instance.
SELECT format('CREATE DATABASE %I', name)
FROM (VALUES ('product'), ('order'), ('payment')) AS databases(name)
WHERE NOT EXISTS (SELECT FROM pg_database WHERE datname = name)
\gexec
