/*     */ import java.nio.Buffer;
/*     */ import java.nio.FloatBuffer;
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
/*     */ public class bmw
/*     */   extends bmy
/*     */ {
/*  31 */   private static bmw e = new bmw();
/*     */   
/*     */   public static bmy a() {
/*  34 */     e.b();
/*  35 */     return e;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private void a(float[][] paramArrayOfFloat, int paramInt)
/*     */   {
/*  48 */     float f1 = qh.c(paramArrayOfFloat[paramInt][0] * paramArrayOfFloat[paramInt][0] + paramArrayOfFloat[paramInt][1] * paramArrayOfFloat[paramInt][1] + paramArrayOfFloat[paramInt][2] * paramArrayOfFloat[paramInt][2]);
/*     */     
/*     */ 
/*     */ 
/*  52 */     paramArrayOfFloat[paramInt][0] /= f1;
/*  53 */     paramArrayOfFloat[paramInt][1] /= f1;
/*  54 */     paramArrayOfFloat[paramInt][2] /= f1;
/*  55 */     paramArrayOfFloat[paramInt][3] /= f1;
/*     */   }
/*     */   
/*  58 */   private FloatBuffer f = ban.h(16);
/*  59 */   private FloatBuffer g = ban.h(16);
/*  60 */   private FloatBuffer h = ban.h(16);
/*     */   
/*     */   private void b() {
/*  63 */     this.f.clear();
/*  64 */     this.g.clear();
/*  65 */     this.h.clear();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*  70 */     GL11.glGetFloat(2983, this.f);
/*     */     
/*     */ 
/*     */ 
/*  74 */     GL11.glGetFloat(2982, this.g);
/*     */     
/*  76 */     this.f.flip().limit(16);
/*  77 */     this.f.get(this.b);
/*  78 */     this.g.flip().limit(16);
/*  79 */     this.g.get(this.c);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*  84 */     this.d[0] = (this.c[0] * this.b[0] + this.c[1] * this.b[4] + this.c[2] * this.b[8] + this.c[3] * this.b[12]);
/*  85 */     this.d[1] = (this.c[0] * this.b[1] + this.c[1] * this.b[5] + this.c[2] * this.b[9] + this.c[3] * this.b[13]);
/*  86 */     this.d[2] = (this.c[0] * this.b[2] + this.c[1] * this.b[6] + this.c[2] * this.b[10] + this.c[3] * this.b[14]);
/*  87 */     this.d[3] = (this.c[0] * this.b[3] + this.c[1] * this.b[7] + this.c[2] * this.b[11] + this.c[3] * this.b[15]);
/*     */     
/*  89 */     this.d[4] = (this.c[4] * this.b[0] + this.c[5] * this.b[4] + this.c[6] * this.b[8] + this.c[7] * this.b[12]);
/*  90 */     this.d[5] = (this.c[4] * this.b[1] + this.c[5] * this.b[5] + this.c[6] * this.b[9] + this.c[7] * this.b[13]);
/*  91 */     this.d[6] = (this.c[4] * this.b[2] + this.c[5] * this.b[6] + this.c[6] * this.b[10] + this.c[7] * this.b[14]);
/*  92 */     this.d[7] = (this.c[4] * this.b[3] + this.c[5] * this.b[7] + this.c[6] * this.b[11] + this.c[7] * this.b[15]);
/*     */     
/*  94 */     this.d[8] = (this.c[8] * this.b[0] + this.c[9] * this.b[4] + this.c[10] * this.b[8] + this.c[11] * this.b[12]);
/*  95 */     this.d[9] = (this.c[8] * this.b[1] + this.c[9] * this.b[5] + this.c[10] * this.b[9] + this.c[11] * this.b[13]);
/*  96 */     this.d[10] = (this.c[8] * this.b[2] + this.c[9] * this.b[6] + this.c[10] * this.b[10] + this.c[11] * this.b[14]);
/*  97 */     this.d[11] = (this.c[8] * this.b[3] + this.c[9] * this.b[7] + this.c[10] * this.b[11] + this.c[11] * this.b[15]);
/*     */     
/*  99 */     this.d[12] = (this.c[12] * this.b[0] + this.c[13] * this.b[4] + this.c[14] * this.b[8] + this.c[15] * this.b[12]);
/* 100 */     this.d[13] = (this.c[12] * this.b[1] + this.c[13] * this.b[5] + this.c[14] * this.b[9] + this.c[15] * this.b[13]);
/* 101 */     this.d[14] = (this.c[12] * this.b[2] + this.c[13] * this.b[6] + this.c[14] * this.b[10] + this.c[15] * this.b[14]);
/* 102 */     this.d[15] = (this.c[12] * this.b[3] + this.c[13] * this.b[7] + this.c[14] * this.b[11] + this.c[15] * this.b[15]);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 108 */     this.a[0][0] = (this.d[3] - this.d[0]);
/* 109 */     this.a[0][1] = (this.d[7] - this.d[4]);
/* 110 */     this.a[0][2] = (this.d[11] - this.d[8]);
/* 111 */     this.a[0][3] = (this.d[15] - this.d[12]);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 117 */     a(this.a, 0);
/*     */     
/*     */ 
/* 120 */     this.a[1][0] = (this.d[3] + this.d[0]);
/* 121 */     this.a[1][1] = (this.d[7] + this.d[4]);
/* 122 */     this.a[1][2] = (this.d[11] + this.d[8]);
/* 123 */     this.a[1][3] = (this.d[15] + this.d[12]);
/*     */     
/*     */ 
/* 126 */     a(this.a, 1);
/*     */     
/*     */ 
/* 129 */     this.a[2][0] = (this.d[3] + this.d[1]);
/* 130 */     this.a[2][1] = (this.d[7] + this.d[5]);
/* 131 */     this.a[2][2] = (this.d[11] + this.d[9]);
/* 132 */     this.a[2][3] = (this.d[15] + this.d[13]);
/*     */     
/*     */ 
/* 135 */     a(this.a, 2);
/*     */     
/*     */ 
/* 138 */     this.a[3][0] = (this.d[3] - this.d[1]);
/* 139 */     this.a[3][1] = (this.d[7] - this.d[5]);
/* 140 */     this.a[3][2] = (this.d[11] - this.d[9]);
/* 141 */     this.a[3][3] = (this.d[15] - this.d[13]);
/*     */     
/*     */ 
/* 144 */     a(this.a, 3);
/*     */     
/*     */ 
/* 147 */     this.a[4][0] = (this.d[3] - this.d[2]);
/* 148 */     this.a[4][1] = (this.d[7] - this.d[6]);
/* 149 */     this.a[4][2] = (this.d[11] - this.d[10]);
/* 150 */     this.a[4][3] = (this.d[15] - this.d[14]);
/*     */     
/*     */ 
/* 153 */     a(this.a, 4);
/*     */     
/*     */ 
/* 156 */     this.a[5][0] = (this.d[3] + this.d[2]);
/* 157 */     this.a[5][1] = (this.d[7] + this.d[6]);
/* 158 */     this.a[5][2] = (this.d[11] + this.d[10]);
/* 159 */     this.a[5][3] = (this.d[15] + this.d[14]);
/*     */     
/*     */ 
/* 162 */     a(this.a, 5);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bmw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */