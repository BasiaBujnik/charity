#run with Invoke-Pester -Path .\app.Tests.ps1

Describe "League tests" {
    BeforeAll{
        . "$PSScriptRoot\app.ps1" -Force #import script1 with Force to re-load memory
    }
    Context "When teams play a game" {
        It "should Legia win if Legia plays" {
            Select-Winner -Team1 "Legia" -Team2 "Widzew" | Should -be "Legia"
        }
        It "should another win if legia plays not" {
            Select-Winner -Team1 "Other" -Team2 "Widzew" | Should -be "Widzew"
        }
    }
}