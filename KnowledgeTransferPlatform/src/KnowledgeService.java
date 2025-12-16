import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import static com.mongodb.client.model.Filters.eq;

public class KnowledgeService {
    private MongoCollection<Document> collection;

    public KnowledgeService() {
        MongoClient client = new MongoClient("localhost", 27017);
        MongoDatabase db = client.getDatabase("knowledge_db");
        collection = db.getCollection("knowledge");
    }

    // Create
    public void addKnowledge(Knowledge k) {
        Document doc = new Document("title", k.getTitle())
                .append("description", k.getDescription())
                .append("author", k.getAuthor());
        collection.insertOne(doc);
        System.out.println("✅ Knowledge added successfully!");
    }

    // Read
    public void viewAll() {
        for (Document d : collection.find()) {
            System.out.println(d.toJson());
        }
    }

    // Update
    public void updateKnowledge(String title, String newDesc) {
        collection.updateOne(eq("title", title),
                new Document("$set", new Document("description", newDesc)));
        System.out.println("✏️ Knowledge updated!");
    }

    // Delete
    public void deleteKnowledge(String title) {
        collection.deleteOne(eq("title", title));
        System.out.println("🗑️ Knowledge deleted!");
    }
}
