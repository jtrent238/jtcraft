/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ import javax.vecmath.Matrix4f;
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
/*     */ public class bpk
/*     */ {
/*     */   private final bpi c;
/*     */   public final bmg a;
/*     */   public final bmg b;
/*  19 */   private final List d = Lists.newArrayList();
/*  20 */   private final List e = Lists.newArrayList();
/*  21 */   private final List f = Lists.newArrayList();
/*  22 */   private final List g = Lists.newArrayList();
/*     */   private Matrix4f h;
/*     */   
/*     */   public bpk(bqy parambqy, String paramString, bmg parambmg1, bmg parambmg2) {
/*  26 */     this.c = new bpi(parambqy, paramString);
/*  27 */     this.a = parambmg1;
/*  28 */     this.b = parambmg2;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void b()
/*     */   {
/*  36 */     this.c.a();
/*     */   }
/*     */   
/*     */   public void a(String paramString, Object paramObject, int paramInt1, int paramInt2) {
/*  40 */     this.e.add(this.e.size(), paramString);
/*  41 */     this.d.add(this.d.size(), paramObject);
/*  42 */     this.f.add(this.f.size(), Integer.valueOf(paramInt1));
/*  43 */     this.g.add(this.g.size(), Integer.valueOf(paramInt2));
/*     */   }
/*     */   
/*     */   private void d() {
/*  47 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  48 */     GL11.glDisable(3042);
/*  49 */     GL11.glDisable(2929);
/*  50 */     GL11.glDisable(3008);
/*  51 */     GL11.glDisable(2912);
/*  52 */     GL11.glDisable(2896);
/*  53 */     GL11.glDisable(2903);
/*  54 */     GL11.glEnable(3553);
/*  55 */     GL11.glBindTexture(3553, 0);
/*     */   }
/*     */   
/*     */   public void a(Matrix4f paramMatrix4f) {
/*  59 */     this.h = paramMatrix4f;
/*     */   }
/*     */   
/*     */   public void a(float paramFloat) {
/*  63 */     d();
/*  64 */     this.a.e();
/*     */     
/*  66 */     float f1 = this.b.a;
/*  67 */     float f2 = this.b.b;
/*  68 */     GL11.glViewport(0, 0, (int)f1, (int)f2);
/*     */     
/*  70 */     this.c.a("DiffuseSampler", this.a);
/*     */     
/*     */ 
/*  73 */     for (int i = 0; i < this.d.size(); i++) {
/*  74 */       this.c.a((String)this.e.get(i), this.d.get(i));
/*  75 */       this.c.b("AuxSize" + i).a(((Integer)this.f.get(i)).intValue(), ((Integer)this.g.get(i)).intValue());
/*     */     }
/*     */     
/*  78 */     this.c.b("ProjMat").a(this.h);
/*  79 */     this.c.b("InSize").a(this.a.a, this.a.b);
/*  80 */     this.c.b("OutSize").a(f1, f2);
/*  81 */     this.c.b("Time").a(paramFloat);
/*     */     
/*  83 */     bao localbao = bao.B();
/*  84 */     this.c.b("ScreenSize").a(localbao.d, localbao.e);
/*  85 */     this.c.c();
/*  86 */     this.b.f();
/*  87 */     this.b.a(false);
/*     */     
/*  89 */     GL11.glDepthMask(false);
/*  90 */     GL11.glColorMask(true, true, true, false);
/*     */     
/*     */ 
/*  93 */     bmh localbmh = bmh.a;
/*  94 */     localbmh.b();
/*  95 */     localbmh.c(-1);
/*  96 */     localbmh.a(0.0D, f2, 500.0D);
/*  97 */     localbmh.a(f1, f2, 500.0D);
/*  98 */     localbmh.a(f1, 0.0D, 500.0D);
/*  99 */     localbmh.a(0.0D, 0.0D, 500.0D);
/* 100 */     localbmh.a();
/*     */     
/* 102 */     GL11.glDepthMask(true);
/* 103 */     GL11.glColorMask(true, true, true, true);
/*     */     
/* 105 */     this.c.b();
/* 106 */     this.b.e();
/* 107 */     this.a.d();
/* 108 */     for (Object localObject : this.d) {
/* 109 */       if ((localObject instanceof bmg)) {
/* 110 */         ((bmg)localObject).d();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public bpi c() {
/* 116 */     return this.c;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bpk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */