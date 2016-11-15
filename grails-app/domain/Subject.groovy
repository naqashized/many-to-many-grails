/**
 * Created by tahir.n on 15/11/2016.
 */
class Subject {

    long id;
    String title;
    static hasMany = [members: User]
    static belongsTo = User

}
