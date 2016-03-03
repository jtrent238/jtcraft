/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bcu
/*    */   extends bcw
/*    */ {
/*    */   private final String r;
/*    */   private final String s;
/*    */   private final String t;
/* 15 */   private boolean u = true;
/*    */   
/*    */   public bcu(bcv parambcv, String paramString, int paramInt, boolean paramBoolean)
/*    */   {
/* 19 */     super(parambcv, brp.a(paramBoolean ? "chat.link.confirmTrusted" : "chat.link.confirm", new Object[0]), paramString, paramInt);
/*    */     
/* 21 */     this.g = brp.a(paramBoolean ? "chat.link.open" : "gui.yes", new Object[0]);
/* 22 */     this.h = brp.a(paramBoolean ? "gui.cancel" : "gui.no", new Object[0]);
/* 23 */     this.s = brp.a("chat.copy", new Object[0]);
/* 24 */     this.r = brp.a("chat.link.warning", new Object[0]);
/* 25 */     this.t = paramString;
/*    */   }
/*    */   
/*    */   public void b()
/*    */   {
/* 30 */     this.n.add(new bcb(0, this.l / 3 - 83 + 0, this.m / 6 + 96, 100, 20, this.g));
/* 31 */     this.n.add(new bcb(2, this.l / 3 - 83 + 105, this.m / 6 + 96, 100, 20, this.s));
/* 32 */     this.n.add(new bcb(1, this.l / 3 - 83 + 210, this.m / 6 + 96, 100, 20, this.h));
/*    */   }
/*    */   
/*    */   protected void a(bcb parambcb)
/*    */   {
/* 37 */     if (parambcb.k == 2) {
/* 38 */       a();
/*    */     }
/*    */     
/* 41 */     this.a.a(parambcb.k == 0, this.i);
/*    */   }
/*    */   
/*    */   public void a() {
/* 45 */     e(this.t);
/*    */   }
/*    */   
/*    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*    */   {
/* 50 */     super.a(paramInt1, paramInt2, paramFloat);
/*    */     
/* 52 */     if (this.u) a(this.q, this.r, this.l / 2, 110, 16764108);
/*    */   }
/*    */   
/*    */   public void f() {
/* 56 */     this.u = false;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bcu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */