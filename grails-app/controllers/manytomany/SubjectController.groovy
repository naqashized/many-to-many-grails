package manytomany

class SubjectController {

    static scaffold = Subject

    def assign ={

        def user = new User(username: "code").save()
        def subject = new Subject(title:"Maths").addToMembers(user)
        new Subject(title:"Science").addToMembers(user)
        println("done");
    }

}
