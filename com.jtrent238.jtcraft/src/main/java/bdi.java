/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bdi
/*    */   extends bct
/*    */ {
/*    */   public void b()
/*    */   {
/* 20 */     super.b();
/*    */     
/* 22 */     this.n.add(new bcb(1, this.l / 2 - 100, this.m - 40, brp.a("multiplayer.stopSleeping", new Object[0])));
/*    */   }
/*    */   
/*    */   protected void a(char paramChar, int paramInt)
/*    */   {
/* 27 */     if (paramInt == 1) {
/* 28 */       f();
/* 29 */     } else if ((paramInt == 28) || (paramInt == 156)) {
/* 30 */       String str = this.a.b().trim();
/*    */       
/* 32 */       if (!str.isEmpty()) {
/* 33 */         this.k.h.a(str);
/*    */       }
/*    */       
/* 36 */       this.a.a("");
/* 37 */       this.k.r.b().d();
/*    */     } else {
/* 39 */       super.a(paramChar, paramInt);
/*    */     }
/*    */   }
/*    */   
/*    */   protected void a(bcb parambcb)
/*    */   {
/* 45 */     if (parambcb.k == 1) {
/* 46 */       f();
/*    */     } else {
/* 48 */       super.a(parambcb);
/*    */     }
/*    */   }
/*    */   
/*    */   private void f() {
/* 53 */     bjb localbjb = this.k.h.a;
/* 54 */     localbjb.a(new jj(this.k.h, 3));
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bdi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */