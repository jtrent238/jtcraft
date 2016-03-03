/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.GsonBuilder;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStreamReader;
/*     */ import java.lang.reflect.ParameterizedType;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Map.Entry;
/*     */ import java.util.Random;
/*     */ import org.apache.commons.lang3.ArrayUtils;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class btp
/*     */   implements bqz, lr
/*     */ {
/*  31 */   private static final Logger b = ;
/*     */   
/*  33 */   private static final Gson c = new GsonBuilder().registerTypeAdapter(bsp.class, new bss()).create();
/*     */   
/*  35 */   private static final ParameterizedType d = new btq();
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
/*  55 */   public static final bti a = new bti(new bqx("meta:missing_sound"), 0.0D, 0.0D, false);
/*     */   
/*  57 */   private final btt e = new btt();
/*     */   private final btj f;
/*     */   private final bqy g;
/*     */   
/*     */   public btp(bqy parambqy, bbj parambbj) {
/*  62 */     this.g = parambqy;
/*  63 */     this.f = new btj(this, parambbj);
/*     */   }
/*     */   
/*     */   public void a(bqy parambqy)
/*     */   {
/*  68 */     this.f.a();
/*     */     
/*  70 */     this.e.c();
/*     */     
/*  72 */     for (String str : parambqy.a()) {
/*     */       try {
/*  74 */         List localList = parambqy.b(new bqx(str, "sounds.json"));
/*     */         
/*  76 */         for (bqw localbqw : localList) {
/*     */           try {
/*  78 */             Map localMap = (Map)c.fromJson(new InputStreamReader(localbqw.b()), d);
/*  79 */             for (Map.Entry localEntry : localMap.entrySet()) {
/*  80 */               a(new bqx(str, (String)localEntry.getKey()), (bsp)localEntry.getValue());
/*     */             }
/*     */           } catch (RuntimeException localRuntimeException) {
/*  83 */             b.warn("Invalid sounds.json", localRuntimeException);
/*     */           }
/*     */         }
/*     */       }
/*     */       catch (IOException localIOException) {}
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(bqx parambqx, bsp parambsp) {
/*     */     bto localbto;
/*  93 */     if ((!this.e.d(parambqx)) || (parambsp.b())) {
/*  94 */       b.debug("Registered/replaced new sound event location {}", new Object[] { parambqx });
/*  95 */       localbto = new bto(parambqx, 1.0D, 1.0D, parambsp.c());
/*  96 */       this.e.a(localbto);
/*     */     } else {
/*  98 */       localbto = (bto)this.e.a(parambqx);
/*     */     }
/*     */     
/* 101 */     for (bsq localbsq : parambsp.a()) {
/* 102 */       String str1 = localbsq.a();
/*     */       
/* 104 */       bqx localbqx1 = new bqx(str1);
/* 105 */       String str2 = str1.contains(":") ? localbqx1.b() : parambqx.b();
/*     */       
/*     */       Object localObject;
/* 108 */       switch (bts.a[localbsq.e().ordinal()]) {
/*     */       case 1: 
/* 110 */         bqx localbqx2 = new bqx(str2, "sounds/" + localbqx1.a() + ".ogg");
/*     */         try
/*     */         {
/* 113 */           this.g.a(localbqx2);
/*     */         } catch (FileNotFoundException localFileNotFoundException) {
/* 115 */           b.warn("File {} does not exist, cannot add it to event {}", new Object[] { localbqx2, parambqx });
/* 116 */           continue;
/*     */         } catch (IOException localIOException) {
/* 118 */           b.warn("Could not load sound file " + localbqx2 + ", cannot add it to event " + parambqx, localIOException); }
/* 119 */         continue;
/*     */         
/*     */ 
/* 122 */         localObject = new btv(new bti(localbqx2, localbsq.c(), localbsq.b(), localbsq.f()), localbsq.d());
/* 123 */         break;
/*     */       case 2: 
/* 125 */         localObject = new btr(this, str2, localbsq);
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
/* 140 */         break;
/*     */       default: 
/* 142 */         throw new IllegalStateException("IN YOU FACE");
/*     */         
/*     */ 
/* 145 */         localbto.a((btu)localObject); }
/*     */     }
/*     */   }
/*     */   
/*     */   public bto a(bqx parambqx) {
/* 150 */     return (bto)this.e.a(parambqx);
/*     */   }
/*     */   
/*     */   public void a(bst parambst) {
/* 154 */     this.f.c(parambst);
/*     */   }
/*     */   
/*     */   public void a(bst parambst, int paramInt) {
/* 158 */     this.f.a(parambst, paramInt);
/*     */   }
/*     */   
/*     */   public void a(yz paramyz, float paramFloat) {
/* 162 */     this.f.a(paramyz, paramFloat);
/*     */   }
/*     */   
/*     */   public void b() {
/* 166 */     this.f.e();
/*     */   }
/*     */   
/*     */   public void c() {
/* 170 */     this.f.c();
/*     */   }
/*     */   
/*     */   public void d() {
/* 174 */     this.f.b();
/*     */   }
/*     */   
/*     */   public void a()
/*     */   {
/* 179 */     this.f.d();
/*     */   }
/*     */   
/*     */   public void e() {
/* 183 */     this.f.f();
/*     */   }
/*     */   
/*     */   public void a(w paramw, float paramFloat) {
/* 187 */     if ((paramw == w.a) && (paramFloat <= 0.0F)) {
/* 188 */       c();
/*     */     }
/*     */     
/* 191 */     this.f.a(paramw, paramFloat);
/*     */   }
/*     */   
/*     */   public void b(bst parambst) {
/* 195 */     this.f.b(parambst);
/*     */   }
/*     */   
/*     */   public bto a(w... paramVarArgs) {
/* 199 */     ArrayList localArrayList = Lists.newArrayList();
/*     */     
/* 201 */     for (bqx localbqx : this.e.b()) {
/* 202 */       bto localbto = (bto)this.e.a(localbqx);
/* 203 */       if (ArrayUtils.contains(paramVarArgs, localbto.d())) {
/* 204 */         localArrayList.add(localbto);
/*     */       }
/*     */     }
/*     */     
/* 208 */     if (localArrayList.isEmpty()) {
/* 209 */       return null;
/*     */     }
/* 211 */     return (bto)localArrayList.get(new Random().nextInt(localArrayList.size()));
/*     */   }
/*     */   
/*     */   public boolean c(bst parambst)
/*     */   {
/* 216 */     return this.f.a(parambst);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\btp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */