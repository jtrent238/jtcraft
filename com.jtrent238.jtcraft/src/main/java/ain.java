/*    */ import java.util.ArrayList;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ain
/*    */   extends ahu
/*    */ {
/*    */   protected ahu aD;
/*    */   
/*    */   public ain(int paramInt, ahu paramahu)
/*    */   {
/* 14 */     super(paramInt);
/* 15 */     this.aD = paramahu;
/* 16 */     a(paramahu.ag, true);
/*    */     
/* 18 */     this.af = (paramahu.af + " M");
/*    */     
/* 20 */     this.ai = paramahu.ai;
/* 21 */     this.ak = paramahu.ak;
/* 22 */     this.al = paramahu.al;
/* 23 */     this.am = paramahu.am;
/* 24 */     this.an = paramahu.an;
/* 25 */     this.ao = paramahu.ao;
/* 26 */     this.ap = paramahu.ap;
/* 27 */     this.aq = paramahu.aq;
/* 28 */     this.aw = paramahu.aw;
/* 29 */     this.ax = paramahu.ax;
/*    */     
/* 31 */     this.at = new ArrayList(paramahu.at);
/* 32 */     this.as = new ArrayList(paramahu.as);
/* 33 */     this.av = new ArrayList(paramahu.av);
/* 34 */     this.au = new ArrayList(paramahu.au);
/*    */     
/* 36 */     this.ao = paramahu.ao;
/* 37 */     this.ap = paramahu.ap;
/*    */     
/* 39 */     this.am = (paramahu.am + 0.1F);
/* 40 */     this.an = (paramahu.an + 0.2F);
/*    */   }
/*    */   
/*    */ 
/*    */   public void a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2)
/*    */   {
/* 46 */     this.aD.ar.a(paramahb, paramRandom, this, paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */   public void a(ahb paramahb, Random paramRandom, aji[] paramArrayOfaji, byte[] paramArrayOfByte, int paramInt1, int paramInt2, double paramDouble)
/*    */   {
/* 51 */     this.aD.a(paramahb, paramRandom, paramArrayOfaji, paramArrayOfByte, paramInt1, paramInt2, paramDouble);
/*    */   }
/*    */   
/*    */   public float g()
/*    */   {
/* 56 */     return this.aD.g();
/*    */   }
/*    */   
/*    */   public arc a(Random paramRandom)
/*    */   {
/* 61 */     return this.aD.a(paramRandom);
/*    */   }
/*    */   
/*    */   public int c(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 66 */     return this.aD.c(paramInt1, paramInt2, paramInt2);
/*    */   }
/*    */   
/*    */   public int b(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 71 */     return this.aD.b(paramInt1, paramInt2, paramInt2);
/*    */   }
/*    */   
/*    */   public Class l()
/*    */   {
/* 76 */     return this.aD.l();
/*    */   }
/*    */   
/*    */   public boolean a(ahu paramahu)
/*    */   {
/* 81 */     return this.aD.a(paramahu);
/*    */   }
/*    */   
/*    */   public ahw m()
/*    */   {
/* 86 */     return this.aD.m();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ain.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */