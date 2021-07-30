//funkcja
def generateNamesWithPadding(int elementCount=10, String namePattern='PerformanceProject_', int paddedStringLength=3){
    def names = []
    (1..elementCount).each{ nr ->
        def suffix = (nr as String).padLeft(paddedStringLength,"0")
        def name = "${namePattern}${suffix}"
        names << name
    }
    names
}
//closure
gen = { pass, userNames, projectNames ->
    userNames.each { userName ->
        projectNames.each {
            projectName ->
                println "${userName}@${projectName},${pass}"
        }
    }
}

final int PROJECT_COUNT=2, USERS_PER_PROJECT=2, PADDING=2
final String USER_PATTERN='user'
def projectNames = generateNamesWithPadding(PROJECT_COUNT)
def userNames = generateNamesWithPadding(USERS_PER_PROJECT,USER_PATTERN,PADDING)
gen "PASS_TO_REPLACE", userNames, projectNames