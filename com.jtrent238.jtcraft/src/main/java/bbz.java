/*     */ import java.util.Map;
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
/*     */ class bbz
/*     */ {
/*     */   private final ayi b;
/*     */   private final bpq c;
/*     */   private final bqx d;
/*     */   private final int[] e;
/*     */   
/*     */   private bbz(bbx parambbx, ayi paramayi)
/*     */   {
/*  60 */     this.b = paramayi;
/*  61 */     this.c = new bpq(128, 128);
/*  62 */     this.e = this.c.d();
/*  63 */     this.d = bbx.a(parambbx).a("map/" + paramayi.h, this.c);
/*     */     
/*     */ 
/*  66 */     for (int i = 0; i < this.e.length; i++) {
/*  67 */       this.e[i] = 0;
/*     */     }
/*     */   }
/*     */   
/*     */   private void a() {
/*  72 */     for (int i = 0; i < 16384; i++) {
/*  73 */       int j = this.b.e[i] & 0xFF;
/*  74 */       if (j / 4 == 0) {
/*  75 */         this.e[i] = ((i + i / 128 & 0x1) * 8 + 16 << 24);
/*     */       } else {
/*  77 */         this.e[i] = awv.a[(j / 4)].b(j & 0x3);
/*     */       }
/*     */     }
/*     */     
/*  81 */     this.c.a();
/*     */   }
/*     */   
/*     */   private void a(boolean paramBoolean) {
/*  85 */     int i = 0;
/*  86 */     int j = 0;
/*  87 */     bmh localbmh = bmh.a;
/*     */     
/*  89 */     float f1 = 0.0F;
/*     */     
/*  91 */     bbx.a(this.a).a(this.d);
/*  92 */     GL11.glEnable(3042);
/*  93 */     buu.c(1, 771, 0, 1);
/*  94 */     GL11.glDisable(3008);
/*  95 */     localbmh.b();
/*  96 */     localbmh.a(i + 0 + f1, j + 128 - f1, -0.009999999776482582D, 0.0D, 1.0D);
/*  97 */     localbmh.a(i + 128 - f1, j + 128 - f1, -0.009999999776482582D, 1.0D, 1.0D);
/*  98 */     localbmh.a(i + 128 - f1, j + 0 + f1, -0.009999999776482582D, 1.0D, 0.0D);
/*  99 */     localbmh.a(i + 0 + f1, j + 0 + f1, -0.009999999776482582D, 0.0D, 0.0D);
/* 100 */     localbmh.a();
/* 101 */     GL11.glEnable(3008);
/* 102 */     GL11.glDisable(3042);
/*     */     
/* 104 */     bbx.a(this.a).a(bbx.b());
/* 105 */     int k = 0;
/* 106 */     for (ayk localayk : this.b.g.values()) {
/* 107 */       if ((!paramBoolean) || (localayk.a == 1)) {
/* 108 */         GL11.glPushMatrix();
/* 109 */         GL11.glTranslatef(i + localayk.b / 2.0F + 64.0F, j + localayk.c / 2.0F + 64.0F, -0.02F);
/* 110 */         GL11.glRotatef(localayk.d * 360 / 16.0F, 0.0F, 0.0F, 1.0F);
/* 111 */         GL11.glScalef(4.0F, 4.0F, 3.0F);
/* 112 */         GL11.glTranslatef(-0.125F, 0.125F, 0.0F);
/*     */         
/* 114 */         float f2 = (localayk.a % 4 + 0) / 4.0F;
/* 115 */         float f3 = (localayk.a / 4 + 0) / 4.0F;
/* 116 */         float f4 = (localayk.a % 4 + 1) / 4.0F;
/* 117 */         float f5 = (localayk.a / 4 + 1) / 4.0F;
/*     */         
/* 119 */         localbmh.b();
/* 120 */         localbmh.a(-1.0D, 1.0D, k * 0.001F, f2, f3);
/* 121 */         localbmh.a(1.0D, 1.0D, k * 0.001F, f4, f3);
/* 122 */         localbmh.a(1.0D, -1.0D, k * 0.001F, f4, f5);
/* 123 */         localbmh.a(-1.0D, -1.0D, k * 0.001F, f2, f5);
/* 124 */         localbmh.a();
/* 125 */         GL11.glPopMatrix();
/* 126 */         k++;
/*     */       }
/*     */     }
/* 129 */     GL11.glPushMatrix();
/* 130 */     GL11.glTranslatef(0.0F, 0.0F, -0.04F);
/* 131 */     GL11.glScalef(1.0F, 1.0F, 1.0F);
/* 132 */     GL11.glPopMatrix();
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bbz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */