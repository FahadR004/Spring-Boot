package dev.fahad.movies;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "movies") // This will let the framework know that this class sheet represents each document in the movies collection
// From Lombok, 
@Data // handles all getters and setters
@AllArgsConstructor // creates a constructor will all defined variables as parameters 
@NoArgsConstructor  // creates a constructor with no parameters
public class Movies {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference // This will cause the db to store only the ids of the review
    private List<Review> reviewIds;
}
