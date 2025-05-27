CREATE TABLE garnishment_records (
    case_id SERIAL PRIMARY KEY,
    employeeName VARCHAR(100) NOT NULL,
    amount NUMERIC(10, 2) NOT NULL,
    status VARCHAR(50) NOT NULL,
    courtOrderDate DATE NOT NULL,
    createdBy VARCHAR(50) NOT NULL
);
