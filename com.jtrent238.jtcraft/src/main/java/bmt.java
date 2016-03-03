/*     */ import java.nio.FloatBuffer;
/*     */ import java.util.Random;
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
/*     */ public class bmt
/*     */   extends bml
/*     */ {
/*  17 */   private static final bqx c = new bqx("textures/environment/end_sky.png");
/*  18 */   private static final bqx d = new bqx("textures/entity/end_portal.png");
/*     */   
/*  20 */   private static final Random e = new Random(31100L);
/*     */   
/*     */   public void a(apo paramapo, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat)
/*     */   {
/*  24 */     float f1 = (float)this.a.j;
/*  25 */     float f2 = (float)this.a.k;
/*  26 */     float f3 = (float)this.a.l;
/*     */     
/*  28 */     GL11.glDisable(2896);
/*     */     
/*  30 */     e.setSeed(31100L);
/*     */     
/*  32 */     float f4 = 0.75F;
/*  33 */     for (int i = 0; i < 16; i++) {
/*  34 */       GL11.glPushMatrix();
/*     */       
/*  36 */       float f5 = 16 - i;
/*  37 */       float f6 = 0.0625F;
/*     */       
/*  39 */       float f7 = 1.0F / (f5 + 1.0F);
/*  40 */       if (i == 0) {
/*  41 */         a(c);
/*  42 */         f7 = 0.1F;
/*  43 */         f5 = 65.0F;
/*  44 */         f6 = 0.125F;
/*  45 */         GL11.glEnable(3042);
/*  46 */         GL11.glBlendFunc(770, 771);
/*     */       }
/*  48 */       if (i == 1) {
/*  49 */         a(d);
/*  50 */         GL11.glEnable(3042);
/*  51 */         GL11.glBlendFunc(1, 1);
/*  52 */         f6 = 0.5F;
/*     */       }
/*     */       
/*  55 */       float f8 = (float)-(paramDouble2 + f4);
/*     */       
/*  57 */       float f9 = f8 + baj.b;
/*  58 */       float f10 = f8 + f5 + baj.b;
/*  59 */       float f11 = f9 / f10;
/*  60 */       f11 = (float)(paramDouble2 + f4) + f11;
/*     */       
/*  62 */       GL11.glTranslatef(f1, f11, f3);
/*     */       
/*  64 */       GL11.glTexGeni(8192, 9472, 9217);
/*  65 */       GL11.glTexGeni(8193, 9472, 9217);
/*  66 */       GL11.glTexGeni(8194, 9472, 9217);
/*  67 */       GL11.glTexGeni(8195, 9472, 9216);
/*  68 */       GL11.glTexGen(8192, 9473, a(1.0F, 0.0F, 0.0F, 0.0F));
/*  69 */       GL11.glTexGen(8193, 9473, a(0.0F, 0.0F, 1.0F, 0.0F));
/*  70 */       GL11.glTexGen(8194, 9473, a(0.0F, 0.0F, 0.0F, 1.0F));
/*  71 */       GL11.glTexGen(8195, 9474, a(0.0F, 1.0F, 0.0F, 0.0F));
/*  72 */       GL11.glEnable(3168);
/*  73 */       GL11.glEnable(3169);
/*  74 */       GL11.glEnable(3170);
/*  75 */       GL11.glEnable(3171);
/*     */       
/*  77 */       GL11.glPopMatrix();
/*  78 */       GL11.glMatrixMode(5890);
/*     */       
/*  80 */       GL11.glPushMatrix();
/*  81 */       GL11.glLoadIdentity();
/*     */       
/*  83 */       GL11.glTranslatef(0.0F, (float)(bao.K() % 700000L) / 700000.0F, 0.0F);
/*  84 */       GL11.glScalef(f6, f6, f6);
/*  85 */       GL11.glTranslatef(0.5F, 0.5F, 0.0F);
/*  86 */       GL11.glRotatef((i * i * 4321 + i * 9) * 2.0F, 0.0F, 0.0F, 1.0F);
/*  87 */       GL11.glTranslatef(-0.5F, -0.5F, 0.0F);
/*  88 */       GL11.glTranslatef(-f1, -f3, -f2);
/*  89 */       f9 = f8 + baj.b;
/*  90 */       GL11.glTranslatef(baj.a * f5 / f9, baj.c * f5 / f9, -f2);
/*     */       
/*  92 */       bmh localbmh = bmh.a;
/*  93 */       localbmh.b();
/*     */       
/*  95 */       f11 = e.nextFloat() * 0.5F + 0.1F;
/*  96 */       float f12 = e.nextFloat() * 0.5F + 0.4F;
/*  97 */       float f13 = e.nextFloat() * 0.5F + 0.5F;
/*  98 */       if (i == 0) f11 = f12 = f13 = 1.0F;
/*  99 */       localbmh.a(f11 * f7, f12 * f7, f13 * f7, 1.0F);
/* 100 */       localbmh.a(paramDouble1, paramDouble2 + f4, paramDouble3);
/* 101 */       localbmh.a(paramDouble1, paramDouble2 + f4, paramDouble3 + 1.0D);
/* 102 */       localbmh.a(paramDouble1 + 1.0D, paramDouble2 + f4, paramDouble3 + 1.0D);
/* 103 */       localbmh.a(paramDouble1 + 1.0D, paramDouble2 + f4, paramDouble3);
/* 104 */       localbmh.a();
/*     */       
/* 106 */       GL11.glPopMatrix();
/* 107 */       GL11.glMatrixMode(5888);
/*     */     }
/* 109 */     GL11.glDisable(3042);
/*     */     
/* 111 */     GL11.glDisable(3168);
/* 112 */     GL11.glDisable(3169);
/* 113 */     GL11.glDisable(3170);
/* 114 */     GL11.glDisable(3171);
/* 115 */     GL11.glEnable(2896);
/*     */   }
/*     */   
/* 118 */   FloatBuffer b = ban.h(16);
/*     */   
/*     */   private FloatBuffer a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/* 121 */     this.b.clear();
/* 122 */     this.b.put(paramFloat1).put(paramFloat2).put(paramFloat3).put(paramFloat4);
/* 123 */     this.b.flip();
/* 124 */     return this.b;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bmt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */