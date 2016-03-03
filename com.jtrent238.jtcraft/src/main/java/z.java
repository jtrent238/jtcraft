/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.HashSet;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Map.Entry;
/*     */ import java.util.Set;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ public class z
/*     */   implements ab
/*     */ {
/*  15 */   private static final Logger a = ;
/*  16 */   private final Map b = new HashMap();
/*  17 */   private final Set c = new HashSet();
/*     */   
/*     */   public int a(ac paramac, String paramString)
/*     */   {
/*  21 */     paramString = paramString.trim();
/*  22 */     if (paramString.startsWith("/")) { paramString = paramString.substring(1);
/*     */     }
/*  24 */     String[] arrayOfString = paramString.split(" ");
/*  25 */     String str = arrayOfString[0];
/*     */     
/*  27 */     arrayOfString = a(arrayOfString);
/*     */     
/*  29 */     aa localaa = (aa)this.b.get(str);
/*  30 */     int i = a(localaa, arrayOfString);
/*  31 */     int j = 0;
/*     */     try
/*     */     {
/*  34 */       if (localaa == null) {
/*  35 */         throw new ch();
/*     */       }
/*  37 */       if (localaa.a(paramac)) {
/*  38 */         if (i > -1)
/*     */         {
/*  40 */           mw[] arrayOfmw1 = ad.c(paramac, arrayOfString[i]);
/*  41 */           localObject = arrayOfString[i];
/*     */           
/*  43 */           for (mw localmw : arrayOfmw1) {
/*  44 */             arrayOfString[i] = localmw.b_();
/*     */             try
/*     */             {
/*  47 */               localaa.b(paramac, arrayOfString);
/*  48 */               j++;
/*     */             } catch (cd localcd3) {
/*  50 */               fr localfr2 = new fr(localcd3.getMessage(), localcd3.a());
/*  51 */               localfr2.b().a(a.m);
/*  52 */               paramac.a(localfr2);
/*     */             }
/*     */           }
/*     */           
/*  56 */           arrayOfString[i] = localObject;
/*     */         } else {
/*     */           try {
/*  59 */             localaa.b(paramac, arrayOfString);
/*  60 */             j++;
/*     */           } catch (cd localcd1) {
/*  62 */             localObject = new fr(localcd1.getMessage(), localcd1.a());
/*  63 */             ((fr)localObject).b().a(a.m);
/*  64 */             paramac.a((fj)localObject);
/*     */           }
/*     */         }
/*     */       } else {
/*  68 */         fr localfr1 = new fr("commands.generic.permission", new Object[0]);
/*  69 */         localfr1.b().a(a.m);
/*  70 */         paramac.a(localfr1);
/*     */       }
/*     */     }
/*     */     catch (ci localci) {
/*  74 */       localObject = new fr("commands.generic.usage", new Object[] { new fr(localci.getMessage(), localci.a()) });
/*  75 */       ((fr)localObject).b().a(a.m);
/*  76 */       paramac.a((fj)localObject);
/*     */     } catch (cd localcd2) {
/*  78 */       localObject = new fr(localcd2.getMessage(), localcd2.a());
/*  79 */       ((fr)localObject).b().a(a.m);
/*  80 */       paramac.a((fj)localObject);
/*     */     } catch (Throwable localThrowable) {
/*  82 */       Object localObject = new fr("commands.generic.exception", new Object[0]);
/*  83 */       ((fr)localObject).b().a(a.m);
/*  84 */       paramac.a((fj)localObject);
/*  85 */       a.error("Couldn't process command: '" + paramString + "'", localThrowable);
/*     */     }
/*     */     
/*  88 */     return j;
/*     */   }
/*     */   
/*     */   public aa a(aa paramaa) {
/*  92 */     List localList = paramaa.b();
/*     */     
/*  94 */     this.b.put(paramaa.c(), paramaa);
/*  95 */     this.c.add(paramaa);
/*     */     
/*  97 */     if (localList != null) {
/*  98 */       for (String str : localList) {
/*  99 */         aa localaa = (aa)this.b.get(str);
/*     */         
/* 101 */         if ((localaa == null) || (!localaa.c().equals(str))) {
/* 102 */           this.b.put(str, paramaa);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 107 */     return paramaa;
/*     */   }
/*     */   
/*     */   private static String[] a(String[] paramArrayOfString) {
/* 111 */     String[] arrayOfString = new String[paramArrayOfString.length - 1];
/*     */     
/* 113 */     for (int i = 1; i < paramArrayOfString.length; i++) {
/* 114 */       arrayOfString[(i - 1)] = paramArrayOfString[i];
/*     */     }
/*     */     
/* 117 */     return arrayOfString;
/*     */   }
/*     */   
/*     */   public List b(ac paramac, String paramString)
/*     */   {
/* 122 */     String[] arrayOfString = paramString.split(" ", -1);
/* 123 */     String str = arrayOfString[0];
/*     */     Object localObject;
/* 125 */     if (arrayOfString.length == 1)
/*     */     {
/* 127 */       localObject = new ArrayList();
/*     */       
/* 129 */       for (Map.Entry localEntry : this.b.entrySet()) {
/* 130 */         if ((y.a(str, (String)localEntry.getKey())) && (((aa)localEntry.getValue()).a(paramac))) {
/* 131 */           ((List)localObject).add(localEntry.getKey());
/*     */         }
/*     */       }
/*     */       
/* 135 */       return (List)localObject; }
/* 136 */     if (arrayOfString.length > 1)
/*     */     {
/*     */ 
/* 139 */       localObject = (aa)this.b.get(str);
/*     */       
/* 141 */       if (localObject != null) {
/* 142 */         return ((aa)localObject).a(paramac, a(arrayOfString));
/*     */       }
/*     */     }
/*     */     
/* 146 */     return null;
/*     */   }
/*     */   
/*     */   public List a(ac paramac)
/*     */   {
/* 151 */     ArrayList localArrayList = new ArrayList();
/*     */     
/* 153 */     for (aa localaa : this.c) {
/* 154 */       if (localaa.a(paramac)) {
/* 155 */         localArrayList.add(localaa);
/*     */       }
/*     */     }
/*     */     
/* 159 */     return localArrayList;
/*     */   }
/*     */   
/*     */   public Map a()
/*     */   {
/* 164 */     return this.b;
/*     */   }
/*     */   
/*     */   private int a(aa paramaa, String[] paramArrayOfString) {
/* 168 */     if (paramaa == null) {
/* 169 */       return -1;
/*     */     }
/*     */     
/* 172 */     for (int i = 0; i < paramArrayOfString.length; i++) {
/* 173 */       if ((paramaa.a(paramArrayOfString, i)) && (ad.a(paramArrayOfString[i]))) {
/* 174 */         return i;
/*     */       }
/*     */     }
/*     */     
/* 178 */     return -1;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */