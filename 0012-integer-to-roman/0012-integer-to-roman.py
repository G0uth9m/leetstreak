class Solution(object):
    def intToRoman(self, num):
        roman=["M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"]
        place=[1000,900,500,400,100,90,50,40,10,9,5,4,1]
        res=""
        index=0
        while num>0:
            if num>=place[index]:
                res+=roman[index]
                num-=place[index]
            else:
                index+=1
        return res
