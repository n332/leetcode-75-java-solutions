const max = Math.max(...candies);


var res =[];
for (var i=0; i<candies.length; i++){
    if (candies[i]+extraCandies >= max){
        console.log(candies[i]+extraCandies)
        res.push(true);
    }else{
        console.log(candies[i]+extraCandies)
        res.push(false);
    }
    
}