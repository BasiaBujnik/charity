class Stage {
    def name
    def command
    Stage (name, command){
        this.name = name
        this.command = command
    }
}
def stages = []

stages << new Stage("test","mvn test")
stages << new Stage("build","mvn build")
stages << new Stage("deploy","mvn deploy")

stages.each{
    it -> println "Stage: ${it.name}, Command: ${it.command}"
}