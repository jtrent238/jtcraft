/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bdf
/*    */   extends bdw
/*    */ {
/*    */   private String a;
/*    */   private fj f;
/*    */   private List g;
/*    */   private final bdw h;
/*    */   
/*    */   public bdf(bdw parambdw, String paramString, fj paramfj)
/*    */   {
/* 17 */     this.h = parambdw;
/* 18 */     this.a = brp.a(paramString, new Object[0]);
/* 19 */     this.f = paramfj;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   protected void a(char paramChar, int paramInt) {}
/*    */   
/*    */ 
/*    */   public void b()
/*    */   {
/* 29 */     this.n.clear();
/* 30 */     this.n.add(new bcb(0, this.l / 2 - 100, this.m / 4 + 120 + 12, brp.a("gui.toMenu", new Object[0])));
/*    */     
/* 32 */     this.g = this.q.c(this.f.d(), this.l - 50);
/*    */   }
/*    */   
/*    */   protected void a(bcb parambcb)
/*    */   {
/* 37 */     if (parambcb.k == 0) {
/* 38 */       this.k.a(this.h);
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*    */   {
/* 44 */     c();
/*    */     
/* 46 */     a(this.q, this.a, this.l / 2, this.m / 2 - 50, 11184810);
/*    */     
/* 48 */     int i = this.m / 2 - 30;
/*    */     
/* 50 */     if (this.g != null) {
/* 51 */       for (String str : this.g) {
/* 52 */         a(this.q, str, this.l / 2, i, 16777215);
/* 53 */         i += this.q.a;
/*    */       }
/*    */     }
/*    */     
/* 57 */     super.a(paramInt1, paramInt2, paramFloat);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bdf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */