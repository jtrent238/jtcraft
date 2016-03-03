/*    */ 
/*    */ public class blj
/*    */   extends bli
/*    */ {
/*    */   private bbj e;
/*    */   
/*    */   public blj(bbj parambbj)
/*    */   {
/*  9 */     this.e = parambbj;
/*    */   }
/*    */   
/*    */   public void a()
/*    */   {
/* 14 */     this.a = 0.0F;
/* 15 */     this.b = 0.0F;
/* 16 */     if (this.e.U.d()) this.b += 1.0F;
/* 17 */     if (this.e.W.d()) this.b -= 1.0F;
/* 18 */     if (this.e.V.d()) this.a += 1.0F;
/* 19 */     if (this.e.X.d()) this.a -= 1.0F;
/* 20 */     this.c = this.e.Y.d();
/* 21 */     this.d = this.e.Z.d();
/* 22 */     if (this.d) {
/* 23 */       this.a = ((float)(this.a * 0.3D));
/* 24 */       this.b = ((float)(this.b * 0.3D));
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\blj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */