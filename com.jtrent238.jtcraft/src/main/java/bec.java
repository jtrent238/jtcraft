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
/*    */ public class bec
/*    */   extends bdw
/*    */ {
/*    */   private final bdw f;
/*    */   private final bbj g;
/* 19 */   protected String a = "Options";
/*    */   private String h;
/*    */   
/*    */   public bec(bdw parambdw, bbj parambbj) {
/* 23 */     this.f = parambdw;
/* 24 */     this.g = parambbj;
/*    */   }
/*    */   
/*    */   public void b()
/*    */   {
/* 29 */     int i = 0;
/* 30 */     this.a = brp.a("options.sounds.title", new Object[0]);
/* 31 */     this.h = brp.a("options.off", new Object[0]);
/*    */     
/* 33 */     this.n.add(new bed(this, w.a.b(), this.l / 2 - 155 + i % 2 * 160, this.m / 6 - 12 + 24 * (i >> 1), w.a, true));
/* 34 */     i += 2;
/*    */     
/* 36 */     for (w localw : w.values()) {
/* 37 */       if (localw != w.a) {
/* 38 */         this.n.add(new bed(this, localw.b(), this.l / 2 - 155 + i % 2 * 160, this.m / 6 - 12 + 24 * (i >> 1), localw, false));
/*    */         
/* 40 */         i++;
/*    */       }
/*    */     }
/*    */     
/* 44 */     this.n.add(new bcb(200, this.l / 2 - 100, this.m / 6 + 168, brp.a("gui.done", new Object[0])));
/*    */   }
/*    */   
/*    */   protected void a(bcb parambcb)
/*    */   {
/* 49 */     if (!parambcb.l) { return;
/*    */     }
/* 51 */     if (parambcb.k == 200) {
/* 52 */       this.k.u.b();
/* 53 */       this.k.a(this.f);
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*    */   {
/* 59 */     c();
/* 60 */     a(this.q, this.a, this.l / 2, 15, 16777215);
/* 61 */     super.a(paramInt1, paramInt2, paramFloat);
/*    */   }
/*    */   
/*    */   protected String a(w paramw) {
/* 65 */     float f1 = this.g.a(paramw);
/*    */     
/* 67 */     if (f1 == 0.0F) {
/* 68 */       return this.h;
/*    */     }
/* 70 */     return (int)(f1 * 100.0F) + "%";
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */