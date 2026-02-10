# PR Notes

## PR 1: Order JPA model + sample endpoint
- Use `@Entity` and a repository to map the `orders` table.
- Keep controller logic thin; delegate to the repository.
- Return only the slice needed (top 3) for sample endpoints.

## PR 2: Datasource defaults
- Spring property placeholders support defaults: `${ENV_VAR:default}`.
- Keep secrets out of git by using env vars in real environments.
- Validate schema at startup to catch drift early.

## PR 3: Startup sample data
- `CommandLineRunner` runs once on app startup.
- Guard with `count()` to avoid duplicate inserts.
- Seed data is for dev only; make it toggleable later.
