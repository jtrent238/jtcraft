/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bcs
/*    */   extends bdw
/*    */ {
/* 10 */   private static final bbm[] a = { bbm.r, bbm.s, bbm.t, bbm.u, bbm.v, bbm.B, bbm.D, bbm.E, bbm.C };
/*    */   
/*    */ 
/*    */ 
/* 14 */   private static final bbm[] f = { bbm.z };
/*    */   
/*    */   private final bdw g;
/*    */   
/*    */   private final bbj h;
/*    */   private String i;
/*    */   private String r;
/*    */   private int s;
/*    */   
/*    */   public bcs(bdw parambdw, bbj parambbj)
/*    */   {
/* 25 */     this.g = parambdw;
/* 26 */     this.h = parambbj;
/*    */   }
/*    */   
/*    */   public void b()
/*    */   {
/* 31 */     int j = 0;
/* 32 */     this.i = brp.a("options.chat.title", new Object[0]);
/* 33 */     this.r = brp.a("options.multiplayer.title", new Object[0]);
/*    */     bbm localbbm;
/* 35 */     for (localbbm : a) {
/* 36 */       if (localbbm.a()) {
/* 37 */         this.n.add(new bcn(localbbm.c(), this.l / 2 - 155 + j % 2 * 160, this.m / 6 + 24 * (j >> 1), localbbm));
/*    */       } else {
/* 39 */         this.n.add(new bcj(localbbm.c(), this.l / 2 - 155 + j % 2 * 160, this.m / 6 + 24 * (j >> 1), localbbm, this.h.c(localbbm)));
/*    */       }
/*    */       
/* 42 */       j++;
/*    */     }
/*    */     
/* 45 */     if (j % 2 == 1) j++;
/* 46 */     this.s = (this.m / 6 + 24 * (j >> 1));
/* 47 */     j += 2;
/*    */     
/* 49 */     for (localbbm : f) {
/* 50 */       if (localbbm.a()) {
/* 51 */         this.n.add(new bcn(localbbm.c(), this.l / 2 - 155 + j % 2 * 160, this.m / 6 + 24 * (j >> 1), localbbm));
/*    */       } else {
/* 53 */         this.n.add(new bcj(localbbm.c(), this.l / 2 - 155 + j % 2 * 160, this.m / 6 + 24 * (j >> 1), localbbm, this.h.c(localbbm)));
/*    */       }
/*    */       
/* 56 */       j++;
/*    */     }
/*    */     
/* 59 */     this.n.add(new bcb(200, this.l / 2 - 100, this.m / 6 + 168, brp.a("gui.done", new Object[0])));
/*    */   }
/*    */   
/*    */   protected void a(bcb parambcb)
/*    */   {
/* 64 */     if (!parambcb.l) { return;
/*    */     }
/* 66 */     if ((parambcb.k < 100) && ((parambcb instanceof bcj))) {
/* 67 */       this.h.a(((bcj)parambcb).d(), 1);
/* 68 */       parambcb.j = this.h.c(bbm.a(parambcb.k));
/*    */     }
/* 70 */     if (parambcb.k == 200) {
/* 71 */       this.k.u.b();
/* 72 */       this.k.a(this.g);
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*    */   {
/* 78 */     c();
/* 79 */     a(this.q, this.i, this.l / 2, 20, 16777215);
/* 80 */     a(this.q, this.r, this.l / 2, this.s + 7, 16777215);
/*    */     
/* 82 */     super.a(paramInt1, paramInt2, paramFloat);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bcs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */