/*     */ import com.google.common.collect.Lists;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import java.util.concurrent.ConcurrentHashMap;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ms
/*     */   implements apu
/*     */ {
/*  21 */   private static final Logger b = ;
/*     */   
/*  23 */   private Set c = Collections.newSetFromMap(new ConcurrentHashMap());
/*     */   private apx d;
/*     */   private apu e;
/*     */   private aqc f;
/*  27 */   public boolean a = true;
/*     */   
/*  29 */   private qd g = new qd();
/*  30 */   private List h = new ArrayList();
/*     */   private mt i;
/*     */   
/*     */   public ms(mt parammt, aqc paramaqc, apu paramapu) {
/*  34 */     this.d = new apw(parammt, 0, 0);
/*     */     
/*  36 */     this.i = parammt;
/*  37 */     this.f = paramaqc;
/*  38 */     this.e = paramapu;
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt1, int paramInt2)
/*     */   {
/*  43 */     return this.g.b(agu.a(paramInt1, paramInt2));
/*     */   }
/*     */   
/*     */   public List a() {
/*  47 */     return this.h;
/*     */   }
/*     */   
/*     */   public void b(int paramInt1, int paramInt2) {
/*  51 */     if (this.i.t.e()) {
/*  52 */       r localr = this.i.K();
/*  53 */       int j = paramInt1 * 16 + 8 - localr.a;
/*  54 */       int k = paramInt2 * 16 + 8 - localr.c;
/*  55 */       int m = 128;
/*  56 */       if ((j < -m) || (j > m) || (k < -m) || (k > m)) {
/*  57 */         this.c.add(Long.valueOf(agu.a(paramInt1, paramInt2)));
/*     */       }
/*     */     } else {
/*  60 */       this.c.add(Long.valueOf(agu.a(paramInt1, paramInt2)));
/*     */     }
/*     */   }
/*     */   
/*     */   public void b() {
/*  65 */     for (apx localapx : this.h) {
/*  66 */       b(localapx.g, localapx.h);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public apx c(int paramInt1, int paramInt2)
/*     */   {
/*  73 */     long l = agu.a(paramInt1, paramInt2);
/*  74 */     this.c.remove(Long.valueOf(l));
/*     */     
/*  76 */     apx localapx = (apx)this.g.a(l);
/*  77 */     if (localapx == null) {
/*  78 */       localapx = f(paramInt1, paramInt2);
/*  79 */       if (localapx == null) {
/*  80 */         if (this.e == null) {
/*  81 */           localapx = this.d;
/*     */         } else {
/*     */           try {
/*  84 */             localapx = this.e.d(paramInt1, paramInt2);
/*     */           } catch (Throwable localThrowable) {
/*  86 */             b localb = b.a(localThrowable, "Exception generating new chunk");
/*  87 */             k localk = localb.a("Chunk to be generated");
/*     */             
/*  89 */             localk.a("Location", String.format("%d,%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
/*  90 */             localk.a("Position hash", Long.valueOf(l));
/*  91 */             localk.a("Generator", this.e.f());
/*     */             
/*  93 */             throw new s(localb);
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*  98 */       this.g.a(l, localapx);
/*  99 */       this.h.add(localapx);
/* 100 */       localapx.c();
/* 101 */       localapx.a(this, this, paramInt1, paramInt2);
/*     */     }
/*     */     
/* 104 */     return localapx;
/*     */   }
/*     */   
/*     */ 
/*     */   public apx d(int paramInt1, int paramInt2)
/*     */   {
/* 110 */     apx localapx = (apx)this.g.a(agu.a(paramInt1, paramInt2));
/*     */     
/* 112 */     if (localapx == null) {
/* 113 */       if ((this.i.y) || (this.a)) {
/* 114 */         return c(paramInt1, paramInt2);
/*     */       }
/* 116 */       return this.d;
/*     */     }
/*     */     
/* 119 */     return localapx;
/*     */   }
/*     */   
/*     */   private apx f(int paramInt1, int paramInt2) {
/* 123 */     if (this.f == null) return null;
/*     */     try {
/* 125 */       apx localapx = this.f.a(this.i, paramInt1, paramInt2);
/* 126 */       if (localapx != null) {
/* 127 */         localapx.p = this.i.I();
/* 128 */         if (this.e != null) {
/* 129 */           this.e.e(paramInt1, paramInt2);
/*     */         }
/*     */       }
/* 132 */       return localapx;
/*     */     } catch (Exception localException) {
/* 134 */       b.error("Couldn't load chunk", localException); }
/* 135 */     return null;
/*     */   }
/*     */   
/*     */   private void a(apx paramapx)
/*     */   {
/* 140 */     if (this.f == null) return;
/*     */     try {
/* 142 */       this.f.b(this.i, paramapx);
/*     */     } catch (Exception localException) {
/* 144 */       b.error("Couldn't save entities", localException);
/*     */     }
/*     */   }
/*     */   
/*     */   private void b(apx paramapx) {
/* 149 */     if (this.f == null) return;
/*     */     try {
/* 151 */       paramapx.p = this.i.I();
/* 152 */       this.f.a(this.i, paramapx);
/*     */     } catch (IOException localIOException) {
/* 154 */       b.error("Couldn't save chunk", localIOException);
/*     */     } catch (ahg localahg) {
/* 156 */       b.error("Couldn't save chunk; already in use by another instance of Minecraft?", localahg);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(apu paramapu, int paramInt1, int paramInt2)
/*     */   {
/* 162 */     apx localapx = d(paramInt1, paramInt2);
/* 163 */     if (!localapx.k) {
/* 164 */       localapx.p();
/* 165 */       if (this.e != null) {
/* 166 */         this.e.a(paramapu, paramInt1, paramInt2);
/* 167 */         localapx.e();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public boolean a(boolean paramBoolean, qk paramqk)
/*     */   {
/* 176 */     int j = 0;
/*     */     
/* 178 */     ArrayList localArrayList = Lists.newArrayList(this.h);
/* 179 */     for (int k = 0; k < localArrayList.size(); k++) {
/* 180 */       apx localapx = (apx)localArrayList.get(k);
/* 181 */       if (paramBoolean) a(localapx);
/* 182 */       if (localapx.a(paramBoolean)) {
/* 183 */         b(localapx);
/* 184 */         localapx.n = false;
/* 185 */         j++; if ((j == 24) && (!paramBoolean)) { return false;
/*     */         }
/*     */       }
/*     */     }
/* 189 */     return true;
/*     */   }
/*     */   
/*     */   public void c()
/*     */   {
/* 194 */     if (this.f != null) {
/* 195 */       this.f.b();
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/* 201 */     if (!this.i.c) {
/* 202 */       for (int j = 0; j < 100; j++) {
/* 203 */         if (!this.c.isEmpty()) {
/* 204 */           Long localLong = (Long)this.c.iterator().next();
/*     */           
/* 206 */           apx localapx = (apx)this.g.a(localLong.longValue());
/* 207 */           if (localapx != null) {
/* 208 */             localapx.d();
/* 209 */             b(localapx);
/* 210 */             a(localapx);
/* 211 */             this.h.remove(localapx);
/*     */           }
/*     */           
/* 214 */           this.c.remove(localLong);
/* 215 */           this.g.d(localLong.longValue());
/*     */         }
/*     */       }
/*     */       
/* 219 */       if (this.f != null) { this.f.a();
/*     */       }
/*     */     }
/* 222 */     return this.e.d();
/*     */   }
/*     */   
/*     */   public boolean e()
/*     */   {
/* 227 */     return !this.i.c;
/*     */   }
/*     */   
/*     */ 
/*     */   public String f()
/*     */   {
/* 233 */     return "ServerChunkCache: " + this.g.a() + " Drop: " + this.c.size();
/*     */   }
/*     */   
/*     */   public List a(sx paramsx, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 238 */     return this.e.a(paramsx, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public agt a(ahb paramahb, String paramString, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 243 */     return this.e.a(paramahb, paramString, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int g()
/*     */   {
/* 248 */     return this.g.a();
/*     */   }
/*     */   
/*     */   public void e(int paramInt1, int paramInt2) {}
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ms.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */