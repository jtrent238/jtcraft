/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bgo
/*     */   extends bdw
/*     */ {
/*  14 */   private static final bbm[] a = { bbm.I, bbm.M, bbm.L, bbm.O, bbm.J, bbm.K, bbm.R, bbm.N };
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*  19 */   private static final bbm[] f = { bbm.P, bbm.Q };
/*     */   
/*     */   private final bdw g;
/*     */   
/*     */   private final bbj h;
/*     */   
/*     */   private String i;
/*     */   private String r;
/*     */   private int s;
/*  28 */   private boolean t = false;
/*     */   
/*     */   public bgo(bdw parambdw, bbj parambbj) {
/*  31 */     this.g = parambdw;
/*  32 */     this.h = parambbj;
/*     */   }
/*     */   
/*     */   public void b()
/*     */   {
/*  37 */     int j = 0;
/*  38 */     this.i = brp.a("options.stream.title", new Object[0]);
/*  39 */     this.r = brp.a("options.stream.chat.title", new Object[0]);
/*     */     bbm localbbm;
/*  41 */     for (localbbm : a) {
/*  42 */       if (localbbm.a()) {
/*  43 */         this.n.add(new bcn(localbbm.c(), this.l / 2 - 155 + j % 2 * 160, this.m / 6 + 24 * (j >> 1), localbbm));
/*     */       } else {
/*  45 */         this.n.add(new bcj(localbbm.c(), this.l / 2 - 155 + j % 2 * 160, this.m / 6 + 24 * (j >> 1), localbbm, this.h.c(localbbm)));
/*     */       }
/*     */       
/*  48 */       j++;
/*     */     }
/*     */     
/*  51 */     if (j % 2 == 1) j++;
/*  52 */     this.s = (this.m / 6 + 24 * (j >> 1) + 6);
/*  53 */     j += 2;
/*     */     
/*  55 */     for (localbbm : f) {
/*  56 */       if (localbbm.a()) {
/*  57 */         this.n.add(new bcn(localbbm.c(), this.l / 2 - 155 + j % 2 * 160, this.m / 6 + 24 * (j >> 1), localbbm));
/*     */       } else {
/*  59 */         this.n.add(new bcj(localbbm.c(), this.l / 2 - 155 + j % 2 * 160, this.m / 6 + 24 * (j >> 1), localbbm, this.h.c(localbbm)));
/*     */       }
/*     */       
/*  62 */       j++;
/*     */     }
/*     */     
/*  65 */     this.n.add(new bcb(200, this.l / 2 - 155, this.m / 6 + 168, 150, 20, brp.a("gui.done", new Object[0])));
/*  66 */     ??? = new bcb(201, this.l / 2 + 5, this.m / 6 + 168, 150, 20, brp.a("options.stream.ingestSelection", new Object[0]));
/*  67 */     ((bcb)???).l = (((this.k.Z().m()) && (this.k.Z().v().length > 0)) || (this.k.Z().z()));
/*  68 */     this.n.add(???);
/*     */   }
/*     */   
/*     */   protected void a(bcb parambcb)
/*     */   {
/*  73 */     if (!parambcb.l) { return;
/*     */     }
/*  75 */     if ((parambcb.k < 100) && ((parambcb instanceof bcj))) {
/*  76 */       bbm localbbm = ((bcj)parambcb).d();
/*  77 */       this.h.a(localbbm, 1);
/*  78 */       parambcb.j = this.h.c(bbm.a(parambcb.k));
/*     */       
/*  80 */       if ((this.k.Z().n()) && (localbbm != bbm.P) && (localbbm != bbm.Q)) {
/*  81 */         this.t = true;
/*     */       }
/*  83 */     } else if ((parambcb instanceof bcn)) {
/*  84 */       if (parambcb.k == bbm.J.c()) {
/*  85 */         this.k.Z().s();
/*  86 */       } else if (parambcb.k == bbm.K.c()) {
/*  87 */         this.k.Z().s();
/*  88 */       } else if (this.k.Z().n()) {
/*  89 */         this.t = true;
/*     */       }
/*     */     }
/*     */     
/*  93 */     if (parambcb.k == 200) {
/*  94 */       this.k.u.b();
/*  95 */       this.k.a(this.g);
/*  96 */     } else if (parambcb.k == 201) {
/*  97 */       this.k.u.b();
/*  98 */       this.k.a(new bgm(this));
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*     */   {
/* 104 */     c();
/* 105 */     a(this.q, this.i, this.l / 2, 20, 16777215);
/* 106 */     a(this.q, this.r, this.l / 2, this.s, 16777215);
/*     */     
/* 108 */     if (this.t) {
/* 109 */       a(this.q, a.m + brp.a("options.stream.changes", new Object[0]), this.l / 2, 20 + this.q.a, 16777215);
/*     */     }
/*     */     
/* 112 */     super.a(paramInt1, paramInt2, paramFloat);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bgo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */