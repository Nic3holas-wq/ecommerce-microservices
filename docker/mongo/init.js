// Create the databases without inserting placeholder business records.
for (const name of ['customer', 'notification']) {
    const database = db.getSiblingDB(name);
    if (!database.getCollectionNames().includes(name)) {
        database.createCollection(name);
    }
}
