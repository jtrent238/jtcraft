/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ 
/*     */ public class bpv
/*     */ {
/*     */   private final int a;
/*  11 */   private final Set b = new java.util.HashSet(256);
/*  12 */   private final List c = new ArrayList(256);
/*     */   private int d;
/*     */   private int e;
/*     */   private final int f;
/*     */   private final int g;
/*     */   private final boolean h;
/*     */   private final int i;
/*     */   
/*     */   public bpv(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, int paramInt4)
/*     */   {
/*  22 */     this.a = paramInt4;
/*  23 */     this.f = paramInt1;
/*  24 */     this.g = paramInt2;
/*  25 */     this.h = paramBoolean;
/*  26 */     this.i = paramInt3;
/*     */   }
/*     */   
/*     */   public int a() {
/*  30 */     return this.d;
/*     */   }
/*     */   
/*     */   public int b() {
/*  34 */     return this.e;
/*     */   }
/*     */   
/*     */   public void a(bqd parambqd) {
/*  38 */     bpw localbpw = new bpw(parambqd, this.a);
/*  39 */     if (this.i > 0) {
/*  40 */       localbpw.a(this.i);
/*     */     }
/*  42 */     this.b.add(localbpw);
/*     */   }
/*     */   
/*     */   public void c() {
/*  46 */     bpw[] arrayOfbpw1 = (bpw[])this.b.toArray(new bpw[this.b.size()]);
/*  47 */     Arrays.sort(arrayOfbpw1);
/*     */     
/*  49 */     for (bpw localbpw : arrayOfbpw1) {
/*  50 */       if (!a(localbpw)) {
/*  51 */         String str = String.format("Unable to fit: %s - size: %dx%d - Maybe try a lowerresolution resourcepack?", new Object[] { localbpw.a().g(), Integer.valueOf(localbpw.a().a()), Integer.valueOf(localbpw.a().b()) });
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*  56 */         throw new bpy(localbpw, str);
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*  61 */     if (this.h)
/*     */     {
/*  63 */       this.d = qh.b(this.d);
/*  64 */       this.e = qh.b(this.e);
/*     */     }
/*     */   }
/*     */   
/*     */   public List d() {
/*  69 */     ArrayList localArrayList = Lists.newArrayList();
/*     */     
/*  71 */     for (Object localObject1 = this.c.iterator(); ((Iterator)localObject1).hasNext();) { localObject2 = (bpx)((Iterator)localObject1).next();
/*  72 */       ((bpx)localObject2).a(localArrayList);
/*     */     }
/*     */     
/*  75 */     localObject1 = Lists.newArrayList();
/*  76 */     for (Object localObject2 = localArrayList.iterator(); ((Iterator)localObject2).hasNext();) { bpx localbpx = (bpx)((Iterator)localObject2).next();
/*  77 */       bpw localbpw = localbpx.a();
/*     */       
/*  79 */       bqd localbqd = localbpw.a();
/*  80 */       localbqd.a(this.d, this.e, localbpx.b(), localbpx.c(), localbpw.e());
/*     */       
/*  82 */       ((List)localObject1).add(localbqd);
/*     */     }
/*     */     
/*  85 */     return (List)localObject1;
/*     */   }
/*     */   
/*     */   private static int b(int paramInt1, int paramInt2) {
/*  89 */     return (paramInt1 >> paramInt2) + ((paramInt1 & (1 << paramInt2) - 1) == 0 ? 0 : 1) << paramInt2;
/*     */   }
/*     */   
/*     */   private boolean a(bpw parambpw) {
/*  93 */     for (int j = 0; j < this.c.size(); j++) {
/*  94 */       if (((bpx)this.c.get(j)).a(parambpw)) {
/*  95 */         return true;
/*     */       }
/*     */       
/*     */ 
/*  99 */       parambpw.d();
/* 100 */       if (((bpx)this.c.get(j)).a(parambpw)) {
/* 101 */         return true;
/*     */       }
/*     */       
/*     */ 
/* 105 */       parambpw.d();
/*     */     }
/*     */     
/* 108 */     return b(parambpw);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private boolean b(bpw parambpw)
/*     */   {
/* 119 */     int j = Math.min(parambpw.b(), parambpw.c());
/* 120 */     int k = (this.d == 0) && (this.e == 0) ? 1 : 0;
/*     */     
/*     */     int i1;
/*     */     int m;
/* 124 */     if (this.h) {
/* 125 */       n = qh.b(this.d);
/* 126 */       i1 = qh.b(this.e);
/* 127 */       int i2 = qh.b(this.d + j);
/* 128 */       int i3 = qh.b(this.e + j);
/*     */       
/* 130 */       int i4 = i2 <= this.f ? 1 : 0;
/* 131 */       int i5 = i3 <= this.g ? 1 : 0;
/*     */       
/* 133 */       if ((i4 == 0) && (i5 == 0)) {
/* 134 */         return false;
/*     */       }
/*     */       
/* 137 */       int i6 = n != i2 ? 1 : 0;
/* 138 */       int i7 = i1 != i3 ? 1 : 0;
/*     */       
/* 140 */       if ((i6 ^ i7) != 0)
/*     */       {
/* 142 */         m = i6 == 0 ? 1 : 0;
/*     */       }
/*     */       else {
/* 145 */         m = (i4 != 0) && (n <= i1) ? 1 : 0;
/*     */       }
/*     */     }
/*     */     else {
/* 149 */       n = this.d + j <= this.f ? 1 : 0;
/* 150 */       i1 = this.e + j <= this.g ? 1 : 0;
/*     */       
/* 152 */       if ((n == 0) && (i1 == 0)) {
/* 153 */         return false;
/*     */       }
/*     */       
/*     */ 
/* 157 */       m = (n != 0) && ((k != 0) || (this.d <= this.e)) ? 1 : 0;
/*     */     }
/*     */     
/*     */ 
/* 161 */     int n = Math.max(parambpw.b(), parambpw.c());
/* 162 */     if (qh.b((m != 0 ? this.e : this.d) + n) > (m != 0 ? this.g : this.f)) {
/* 163 */       return false;
/*     */     }
/*     */     
/*     */     bpx localbpx;
/* 167 */     if (m != 0) {
/* 168 */       if (parambpw.b() > parambpw.c()) {
/* 169 */         parambpw.d();
/*     */       }
/*     */       
/*     */ 
/* 173 */       if (this.e == 0) {
/* 174 */         this.e = parambpw.c();
/*     */       }
/*     */       
/* 177 */       localbpx = new bpx(this.d, 0, parambpw.b(), this.e);
/* 178 */       this.d += parambpw.b();
/*     */     }
/*     */     else {
/* 181 */       localbpx = new bpx(0, this.e, this.d, parambpw.c());
/* 182 */       this.e += parambpw.c();
/*     */     }
/*     */     
/* 185 */     localbpx.a(parambpw);
/* 186 */     this.c.add(localbpx);
/*     */     
/* 188 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bpv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */