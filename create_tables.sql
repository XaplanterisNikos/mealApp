CREATE TABLE meal(
    mealId INT NOT NULL GENERATED ALWAYS AS IDENTITY,
    mealName VARCHAR(100) NOT NULL,
    mealCategory VARCHAR(50) NOT NULL, 
    mealCountry VARCHAR(50) NOT NULL,
    mealInstructions VARCHAR(5000) NOT NULL,
    mealcounter INT NOT NULL,
    PRIMARY KEY(mealId)
);