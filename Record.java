public abstract class Record {

public void save(){
	
	// this.validate();
	this.beforeSave();
	createQuery();// INSERT INTO `Users`(firstname, lastname) values('Isaac','Boakye');
	this.afterSave();
} 

public final void connectDB(){
	System.out.println("Conntecting to Database....!");
	System.out.println("Connection Successful!");
}


public final void createQuery(){
	System.out.println("Query return 0;");
	// System.out.println("Connection Successful!");
}





// public abstract void connectDB();
//public abstract void validate();
public abstract void beforeSave();
public abstract void afterSave();
}

// client = new clients_object("Stefan","Mischook");
// client.save();

// Java Spring boot ORM - Java Persistence API / H
// PHP Laravel ORM - Eloquent
// Python Django - Django ORM and SQLAlchemy