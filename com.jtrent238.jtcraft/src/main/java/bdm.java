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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bdm
/*     */   extends bdw
/*     */   implements bcv
/*     */ {
/*  29 */   private static final bbm[] f = { bbm.c, bbm.l };
/*     */   
/*     */   private final bdw g;
/*     */   
/*     */   private final bbj h;
/*     */   
/*  35 */   protected String a = "Options";
/*     */   
/*     */   public bdm(bdw parambdw, bbj parambbj) {
/*  38 */     this.g = parambdw;
/*  39 */     this.h = parambbj;
/*     */   }
/*     */   
/*     */   public void b()
/*     */   {
/*  44 */     int i = 0;
/*  45 */     this.a = brp.a("options.title", new Object[0]);
/*     */     
/*  47 */     for (bbm localbbm : f) {
/*  48 */       if (localbbm.a()) {
/*  49 */         this.n.add(new bcn(localbbm.c(), this.l / 2 - 155 + i % 2 * 160, this.m / 6 - 12 + 24 * (i >> 1), localbbm));
/*     */       } else {
/*  51 */         bcj localbcj = new bcj(localbbm.c(), this.l / 2 - 155 + i % 2 * 160, this.m / 6 - 12 + 24 * (i >> 1), localbbm, this.h.c(localbbm));
/*     */         
/*  53 */         if ((localbbm == bbm.l) && (this.k.f != null) && (this.k.f.N().t())) {
/*  54 */           localbcj.l = false;
/*  55 */           localbcj.j = (brp.a("options.difficulty", new Object[0]) + ": " + brp.a("options.difficulty.hardcore", new Object[0]));
/*     */         }
/*     */         
/*  58 */         this.n.add(localbcj);
/*     */       }
/*     */       
/*  61 */       i++;
/*     */     }
/*     */     
/*  64 */     this.n.add(new bdn(this, 8675309, this.l / 2 + 5, this.m / 6 + 48 - 6, 150, 20, "Super Secret Settings..."));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  74 */     this.n.add(new bcb(106, this.l / 2 - 155, this.m / 6 + 72 - 6, 150, 20, brp.a("options.sounds", new Object[0])));
/*  75 */     this.n.add(new bcb(107, this.l / 2 + 5, this.m / 6 + 72 - 6, 150, 20, brp.a("options.stream", new Object[0])));
/*     */     
/*  77 */     this.n.add(new bcb(101, this.l / 2 - 155, this.m / 6 + 96 - 6, 150, 20, brp.a("options.video", new Object[0])));
/*  78 */     this.n.add(new bcb(100, this.l / 2 + 5, this.m / 6 + 96 - 6, 150, 20, brp.a("options.controls", new Object[0])));
/*     */     
/*  80 */     this.n.add(new bcb(102, this.l / 2 - 155, this.m / 6 + 120 - 6, 150, 20, brp.a("options.language", new Object[0])));
/*  81 */     this.n.add(new bcb(103, this.l / 2 + 5, this.m / 6 + 120 - 6, 150, 20, brp.a("options.multiplayer.title", new Object[0])));
/*     */     
/*  83 */     this.n.add(new bcb(105, this.l / 2 - 155, this.m / 6 + 144 - 6, 150, 20, brp.a("options.resourcepack", new Object[0])));
/*  84 */     this.n.add(new bcb(104, this.l / 2 + 5, this.m / 6 + 144 - 6, 150, 20, brp.a("options.snooper.view", new Object[0])));
/*     */     
/*  86 */     this.n.add(new bcb(200, this.l / 2 - 100, this.m / 6 + 168, brp.a("gui.done", new Object[0])));
/*     */   }
/*     */   
/*     */   protected void a(bcb parambcb)
/*     */   {
/*  91 */     if (!parambcb.l) { return;
/*     */     }
/*  93 */     if ((parambcb.k < 100) && ((parambcb instanceof bcj))) {
/*  94 */       this.h.a(((bcj)parambcb).d(), 1);
/*  95 */       parambcb.j = this.h.c(bbm.a(parambcb.k));
/*     */     }
/*  97 */     if (parambcb.k == 8675309) {
/*  98 */       this.k.p.c();
/*     */     }
/* 100 */     if (parambcb.k == 101) {
/* 101 */       this.k.u.b();
/* 102 */       this.k.a(new bef(this, this.h));
/*     */     }
/* 104 */     if (parambcb.k == 100) {
/* 105 */       this.k.u.b();
/* 106 */       this.k.a(new bew(this, this.h));
/*     */     }
/* 108 */     if (parambcb.k == 102) {
/* 109 */       this.k.u.b();
/* 110 */       this.k.a(new bdj(this, this.h, this.k.S()));
/*     */     }
/* 112 */     if (parambcb.k == 103) {
/* 113 */       this.k.u.b();
/* 114 */       this.k.a(new bcs(this, this.h));
/*     */     }
/* 116 */     if (parambcb.k == 104) {
/* 117 */       this.k.u.b();
/* 118 */       this.k.a(new bea(this, this.h));
/*     */     }
/* 120 */     if (parambcb.k == 200) {
/* 121 */       this.k.u.b();
/* 122 */       this.k.a(this.g);
/*     */     }
/* 124 */     if (parambcb.k == 105) {
/* 125 */       this.k.u.b();
/* 126 */       this.k.a(new bgf(this));
/*     */     }
/* 128 */     if (parambcb.k == 106) {
/* 129 */       this.k.u.b();
/* 130 */       this.k.a(new bec(this, this.h));
/*     */     }
/* 132 */     if (parambcb.k == 107) {
/* 133 */       this.k.u.b();
/*     */       
/* 135 */       bum localbum = this.k.Z();
/* 136 */       if ((localbum.l()) && (localbum.D())) {
/* 137 */         this.k.a(new bgo(this, this.h));
/*     */       } else {
/* 139 */         bgp.a(this);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*     */   {
/* 146 */     c();
/* 147 */     a(this.q, this.a, this.l / 2, 15, 16777215);
/* 148 */     super.a(paramInt1, paramInt2, paramFloat);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bdm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */