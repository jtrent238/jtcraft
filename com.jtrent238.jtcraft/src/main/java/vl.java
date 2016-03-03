/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class vl
/*    */   extends ui
/*    */ {
/*    */   private yv a;
/*    */   
/*    */   public vl(yv paramyv)
/*    */   {
/* 13 */     this.a = paramyv;
/* 14 */     a(5);
/*    */   }
/*    */   
/*    */   public boolean a()
/*    */   {
/* 19 */     if (!this.a.Z()) return false;
/* 20 */     if (this.a.M()) return false;
/* 21 */     if (!this.a.D) return false;
/* 22 */     if (this.a.H) { return false;
/*    */     }
/* 24 */     yz localyz = this.a.b();
/* 25 */     if (localyz == null)
/*    */     {
/* 27 */       return false;
/*    */     }
/*    */     
/* 30 */     if (this.a.f(localyz) > 16.0D)
/*    */     {
/* 32 */       return false;
/*    */     }
/*    */     
/* 35 */     if (!(localyz.bo instanceof zs))
/*    */     {
/* 37 */       return false;
/*    */     }
/*    */     
/* 40 */     return true;
/*    */   }
/*    */   
/*    */   public void c()
/*    */   {
/* 45 */     this.a.m().h();
/*    */   }
/*    */   
/*    */   public void d()
/*    */   {
/* 50 */     this.a.a_(null);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\vl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */