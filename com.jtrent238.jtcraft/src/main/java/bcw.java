/*    */ import java.util.List;
/*    */ 
/*    */ public class bcw
/*    */   extends bdw
/*    */ {
/*    */   protected bcv a;
/*    */   protected String f;
/*    */   private String r;
/*    */   protected String g;
/*    */   protected String h;
/*    */   protected int i;
/*    */   private int s;
/*    */   
/*    */   public bcw(bcv parambcv, String paramString1, String paramString2, int paramInt)
/*    */   {
/* 16 */     this.a = parambcv;
/* 17 */     this.f = paramString1;
/* 18 */     this.r = paramString2;
/* 19 */     this.i = paramInt;
/*    */     
/* 21 */     this.g = brp.a("gui.yes", new Object[0]);
/* 22 */     this.h = brp.a("gui.no", new Object[0]);
/*    */   }
/*    */   
/*    */   public bcw(bcv parambcv, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt) {
/* 26 */     this.a = parambcv;
/* 27 */     this.f = paramString1;
/* 28 */     this.r = paramString2;
/* 29 */     this.g = paramString3;
/* 30 */     this.h = paramString4;
/* 31 */     this.i = paramInt;
/*    */   }
/*    */   
/*    */   public void b()
/*    */   {
/* 36 */     this.n.add(new bcj(0, this.l / 2 - 155, this.m / 6 + 96, this.g));
/* 37 */     this.n.add(new bcj(1, this.l / 2 - 155 + 160, this.m / 6 + 96, this.h));
/*    */   }
/*    */   
/*    */   protected void a(bcb parambcb)
/*    */   {
/* 42 */     this.a.a(parambcb.k == 0, this.i);
/*    */   }
/*    */   
/*    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*    */   {
/* 47 */     c();
/*    */     
/* 49 */     a(this.q, this.f, this.l / 2, 70, 16777215);
/* 50 */     a(this.q, this.r, this.l / 2, 90, 16777215);
/*    */     
/* 52 */     super.a(paramInt1, paramInt2, paramFloat);
/*    */   }
/*    */   
/*    */   public void b(int paramInt) {
/* 56 */     this.s = paramInt;
/*    */     
/* 58 */     for (bcb localbcb : this.n) {
/* 59 */       localbcb.l = false;
/*    */     }
/*    */   }
/*    */   
/*    */   public void e()
/*    */   {
/* 65 */     super.e();
/*    */     
/* 67 */     if (--this.s == 0) {
/* 68 */       for (bcb localbcb : this.n) {
/* 69 */         localbcb.l = true;
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bcw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */