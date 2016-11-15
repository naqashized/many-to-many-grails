/**
 * Created by tahir.n on 15/11/2016.
 */
class User {

    long id;
    String username;
    static hasMany = [subjects: Subject]
}
