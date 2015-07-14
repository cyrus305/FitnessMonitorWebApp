CREATE TABLE fm_records
(
   `Id`          int(10),
   `MemId`       int(10),
   `Calories`    varchar(233),
   `Date`        date,
   `TimeStamp`   timestamp DEFAULT 'CURRENT_TIMESTAMP'
)