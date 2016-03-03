/*     */ import org.lwjgl.opengl.GL11;
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
/*     */ public class beh
/*     */   extends bbw
/*     */ {
/*  16 */   private static final bqx a = new bqx("textures/gui/achievement/achievement_background.png");
/*     */   private bao f;
/*     */   private int g;
/*     */   private int h;
/*     */   private String i;
/*     */   private String j;
/*     */   private pb k;
/*     */   private long l;
/*     */   private bny m;
/*     */   private boolean n;
/*     */   
/*     */   public beh(bao parambao) {
/*  28 */     this.f = parambao;
/*  29 */     this.m = new bny();
/*     */   }
/*     */   
/*     */   public void a(pb parampb) {
/*  33 */     this.i = brp.a("achievement.get", new Object[0]);
/*  34 */     this.j = parampb.e().c();
/*  35 */     this.l = bao.K();
/*  36 */     this.k = parampb;
/*  37 */     this.n = false;
/*     */   }
/*     */   
/*     */   public void b(pb parampb) {
/*  41 */     this.i = parampb.e().c();
/*  42 */     this.j = parampb.f();
/*     */     
/*  44 */     this.l = (bao.K() + 2500L);
/*  45 */     this.k = parampb;
/*  46 */     this.n = true;
/*     */   }
/*     */   
/*     */   private void c() {
/*  50 */     GL11.glViewport(0, 0, this.f.d, this.f.e);
/*  51 */     GL11.glMatrixMode(5889);
/*  52 */     GL11.glLoadIdentity();
/*  53 */     GL11.glMatrixMode(5888);
/*  54 */     GL11.glLoadIdentity();
/*     */     
/*  56 */     this.g = this.f.d;
/*  57 */     this.h = this.f.e;
/*     */     
/*  59 */     bca localbca = new bca(this.f, this.f.d, this.f.e);
/*  60 */     this.g = localbca.a();
/*  61 */     this.h = localbca.b();
/*     */     
/*  63 */     GL11.glClear(256);
/*  64 */     GL11.glMatrixMode(5889);
/*  65 */     GL11.glLoadIdentity();
/*  66 */     GL11.glOrtho(0.0D, this.g, this.h, 0.0D, 1000.0D, 3000.0D);
/*  67 */     GL11.glMatrixMode(5888);
/*  68 */     GL11.glLoadIdentity();
/*  69 */     GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
/*     */   }
/*     */   
/*     */   public void a() {
/*  73 */     if ((this.k == null) || (this.l == 0L) || (bao.B().h == null)) { return;
/*     */     }
/*  75 */     double d1 = (bao.K() - this.l) / 3000.0D;
/*  76 */     if (!this.n) {
/*  77 */       if ((d1 < 0.0D) || (d1 > 1.0D)) {
/*  78 */         this.l = 0L;
/*     */       }
/*     */       
/*     */     }
/*  82 */     else if (d1 > 0.5D) { d1 = 0.5D;
/*     */     }
/*     */     
/*  85 */     c();
/*  86 */     GL11.glDisable(2929);
/*  87 */     GL11.glDepthMask(false);
/*     */     
/*  89 */     double d2 = d1 * 2.0D;
/*  90 */     if (d2 > 1.0D) d2 = 2.0D - d2;
/*  91 */     d2 *= 4.0D;
/*  92 */     d2 = 1.0D - d2;
/*  93 */     if (d2 < 0.0D) d2 = 0.0D;
/*  94 */     d2 *= d2;
/*  95 */     d2 *= d2;
/*     */     
/*  97 */     int i1 = this.g - 160;
/*  98 */     int i2 = 0 - (int)(d2 * 36.0D);
/*  99 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 100 */     GL11.glEnable(3553);
/* 101 */     this.f.P().a(a);
/* 102 */     GL11.glDisable(2896);
/*     */     
/* 104 */     b(i1, i2, 96, 202, 160, 32);
/*     */     
/* 106 */     if (this.n) {
/* 107 */       this.f.l.a(this.j, i1 + 30, i2 + 7, 120, -1);
/*     */     } else {
/* 109 */       this.f.l.b(this.i, i1 + 30, i2 + 7, 65280);
/* 110 */       this.f.l.b(this.j, i1 + 30, i2 + 18, -1);
/*     */     }
/*     */     
/* 113 */     bam.c();
/* 114 */     GL11.glDisable(2896);
/* 115 */     GL11.glEnable(32826);
/* 116 */     GL11.glEnable(2903);
/*     */     
/* 118 */     GL11.glEnable(2896);
/* 119 */     this.m.b(this.f.l, this.f.P(), this.k.d, i1 + 8, i2 + 8);
/* 120 */     GL11.glDisable(2896);
/*     */     
/* 122 */     GL11.glDepthMask(true);
/* 123 */     GL11.glEnable(2929);
/*     */   }
/*     */   
/*     */   public void b() {
/* 127 */     this.k = null;
/* 128 */     this.l = 0L;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\beh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */