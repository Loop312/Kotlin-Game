package characters

/*
Strengths: None
Weaknesses: None
Unique Skill: Exp Multiplier
*/
class Human : Character() {
    override fun gainExp(num: Int){
        exp += (num*2)
    }
}