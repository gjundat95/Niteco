
// for 
var listNumber = [1,2,3,4,5,6,7,8,9,0]
var mScore = 0
for score in listNumber {
	
	if(score < 5){
		mScore += 1
	}else{
		mScore += 2
	}

}
print("Number is: \(mScore)")