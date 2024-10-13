class Solution:
    beg="1"
    def str_com(self,s):
            tem=""
            cnt=1
            ref=self.beg+"0"
            for i in range(len(ref)-1):
                if ref[i]==ref[i+1]:
                    cnt+=1
                else:
                    tem=tem+str(cnt)+ref[i]
                    cnt=1
            return tem
    def countAndSay(self, n:int) -> str:
        if n==1:
            return self.beg
        self.beg=self.str_com(self.beg)
        return self.countAndSay(n-1)