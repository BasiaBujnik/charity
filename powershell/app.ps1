#
function Select-Winner($Team1,$Team2){
    $winner="Legia"
    If($Team1 -eq $winner){
        return $Team1
    }
    return $Team2
}
