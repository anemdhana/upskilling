# Lesson 01 - seed sample data on start

Compare link: https://github.com/anemdhana/upskilling/compare/b1ab990...a4a51b8

## Summary
- Added project docs for PR notes and getting started.
- Added startup sample data loader that seeds orders on first run.

## Files Changed
- order-service/HELP.md (new)
- order-service/docs/PR_NOTES.md (new)
- order-service/src/main/java/com/anem/ewccart/config/SampleOrderDataLoader.java (new)

## Details
- Documentation explains the JPA order model, datasource defaults, and sample seeding guidance.
- Sample data loader runs on startup, checks for existing data, and inserts three sample orders when empty.
